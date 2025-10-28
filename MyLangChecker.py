from MyLangVisitor import MyLangVisitor
from MyLangParser import MyLangParser

class ErroSemantico(Exception):
    """Exceção customizada para erros semânticos."""
    pass

class MyLangChecker(MyLangVisitor):

    def __init__(self):
        self.escopos = [{}]

    def _log_erro(self, ctx, mensagem):
        linha = ctx.start.line
        raise ErroSemantico(f"Erro Semântico (Linha {linha}): {mensagem}")

    def _entrar_escopo(self):
        self.escopos.append({})

    def _sair_escopo(self):
        self.escopos.pop()

    def _declarar_var(self, nome, tipo, ctx):
        escopo_atual = self.escopos[-1]
        if nome in escopo_atual:
            self._log_erro(ctx, f"Variável '{nome}' já declarada neste escopo.")
        escopo_atual[nome] = tipo

    def _buscar_var(self, nome, ctx):
        for escopo in reversed(self.escopos):
            if nome in escopo:
                return escopo[nome]
        self._log_erro(ctx, f"Variável '{nome}' não foi declarada.")

    # --- Visitantes das Regras da Gramática ---

    def visitBloco(self, ctx:MyLangParser.BlocoContext):
        self._entrar_escopo()
        self.visitChildren(ctx)
        self._sair_escopo()

    def visitDeclaracao(self, ctx:MyLangParser.DeclaracaoContext):
        """Req 1: Declaração de variável."""
        nome_var = ctx.ID().getText()
        tipo_var = ctx.tipo().getText()
        self._declarar_var(nome_var, tipo_var, ctx)
        return None

    def visitAtribuicao(self, ctx:MyLangParser.AtribuicaoContext):
        """Req 5: Verificação de tipo na atribuição."""
        nome_var = ctx.ID().getText()
        tipo_declarado = self._buscar_var(nome_var, ctx)
        
        tipo_expressao = self.visit(ctx.expressao())

        if tipo_declarado == 'real' and tipo_expressao == 'inteiro':
             pass
        elif tipo_declarado != tipo_expressao:
            self._log_erro(ctx, f"Tipos incompatíveis. Não é possível atribuir '{tipo_expressao}' para a variável '{nome_var}' do tipo '{tipo_declarado}'.")
        
        return None

    def visitEstruturaIf(self, ctx:MyLangParser.EstruturaIfContext):
        """Req 2: Verifica se a condição do 'se' é booleana."""
        tipo_condicao = self.visit(ctx.expressao())
        if tipo_condicao != 'booleano':
            self._log_erro(ctx, f"A condição da estrutura 'se' deve ser do tipo 'booleano', mas foi recebido '{tipo_condicao}'.")
        self.visit(ctx.bloco(0))
        if ctx.bloco(1):
            self.visit(ctx.bloco(1))

    def visitEstruturaWhile(self, ctx:MyLangParser.EstruturaWhileContext):
        """Req 3: Verifica se a condição do 'enquanto' é booleana."""
        tipo_condicao = self.visit(ctx.expressao())
        if tipo_condicao != 'booleano':
            self._log_erro(ctx, f"A condição da estrutura 'enquanto' deve ser do tipo 'booleano', mas foi recebido '{tipo_condicao}'.")
        self.visit(ctx.bloco())

    def visitComandoIO(self, ctx:MyLangParser.ComandoIOContext):
        """Req 6: Verifica I/O."""
        if ctx.expressao():
            self.visit(ctx.expressao())

        elif ctx.ID():
            nome_var = ctx.ID().getText()
            self._buscar_var(nome_var, ctx)
        return None

    # --- Visitantes de Expressões (Retornam o tipo da expressão) ---

    def visitExprAditiva(self, ctx:MyLangParser.ExprAditivaContext):
        """Req 4: Verificação de tipo para + e -."""
        tipo_esq = self.visit(ctx.expressao(0))
        tipo_dir = self.visit(ctx.expressao(1))

        if tipo_esq not in ('inteiro', 'real') or tipo_dir not in ('inteiro', 'real'):
            self._log_erro(ctx, f"Operações aritméticas (+, -) só podem ser feitas entre 'inteiro' e 'real'. Recebido: {tipo_esq} e {tipo_dir}.")
        
        if tipo_esq == 'real' or tipo_dir == 'real':
            return 'real'
        return 'inteiro'

    def visitExprMultiplicativa(self, ctx:MyLangParser.ExprMultiplicativaContext):
        """Req 4: Verificação de tipo para * e /."""
        tipo_esq = self.visit(ctx.expressao(0))
        tipo_dir = self.visit(ctx.expressao(1))

        if tipo_esq not in ('inteiro', 'real') or tipo_dir not in ('inteiro', 'real'):
            self._log_erro(ctx, f"Operações aritméticas (*, /) só podem ser feitas entre 'inteiro' e 'real'. Recebido: {tipo_esq} e {tipo_dir}.")
        
        # Divisão sempre resulta em 'real' (semântica comum)
        if ctx.op.type == '/':
            return 'real'
        
        # Multiplicação segue a regra de promoção
        if tipo_esq == 'real' or tipo_dir == 'real':
            return 'real'
        return 'inteiro'

    def visitExprRelacional(self, ctx:MyLangParser.ExprRelacionalContext):
        """Verifica tipos em comparações (>, <, ==, !=)."""
        tipo_esq = self.visit(ctx.expressao(0))
        tipo_dir = self.visit(ctx.expressao(1))

        # Permite comparar apenas tipos numéricos entre si
        if tipo_esq in ('inteiro', 'real') and tipo_dir in ('inteiro', 'real'):
            return 'booleano'
        
        # Permite comparar booleanos entre si (apenas == e !=)
        if ctx.op.type in ('==', '!=') and \
           tipo_esq == 'booleano' and tipo_dir == 'booleano':
            return 'booleano'
        
        self._log_erro(ctx, f"Não é possível comparar tipos incompatíveis: {tipo_esq} e {tipo_dir}.")

    def visitExprLogicaE(self, ctx:MyLangParser.ExprLogicaEContext):
        """Verifica tipos para 'e'."""
        tipo_esq = self.visit(ctx.expressao(0))
        tipo_dir = self.visit(ctx.expressao(1))
        if tipo_esq != 'booleano' or tipo_dir != 'booleano':
            self._log_erro(ctx, f"Operador lógico 'e' requer operandos 'booleano'. Recebido: {tipo_esq} e {tipo_dir}.")
        return 'booleano'

    def visitExprLogicaOu(self, ctx:MyLangParser.ExprLogicaOuContext):
        """Verifica tipos para 'ou'."""
        tipo_esq = self.visit(ctx.expressao(0))
        tipo_dir = self.visit(ctx.expressao(1))
        if tipo_esq != 'booleano' or tipo_dir != 'booleano':
            self._log_erro(ctx, f"Operador lógico 'ou' requer operandos 'booleano'. Recebido: {tipo_esq} e {tipo_dir}.")
        return 'booleano'

    # --- Visitantes dos Átomos (Retornam o tipo literal) ---

    def visitExprParenteses(self, ctx:MyLangParser.ExprParentesesContext):
        return self.visit(ctx.expressao())

    def visitAtomId(self, ctx:MyLangParser.AtomIdContext):
        return self._buscar_var(ctx.ID().getText(), ctx)

    def visitAtomInt(self, ctx:MyLangParser.AtomIntContext):
        return 'inteiro'

    def visitAtomReal(self, ctx:MyLangParser.AtomRealContext):
        return 'real'

    def visitAtomBooleanoTrue(self, ctx:MyLangParser.AtomBooleanoTrueContext):
        return 'booleano'

    def visitAtomBooleanoFalse(self, ctx:MyLangParser.AtomBooleanoFalseContext):
        return 'booleano'