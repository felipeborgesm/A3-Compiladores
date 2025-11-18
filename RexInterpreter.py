# Arquivo: RexInterpreter.py
from RexVisitor import RexVisitor
from RexParser import RexParser

class RexInterpreter(RexVisitor):
    def __init__(self):
        self.escopos = [{}] # Pilha de memória

    def _entrar_escopo(self):
        self.escopos.append({})

    def _sair_escopo(self):
        self.escopos.pop()

    def _buscar_var_e_atualizar(self, nome, valor):
        """ atualiza o valor de uma variável existente """
        for escopo in reversed(self.escopos):
            if nome in escopo:
                escopo[nome] = valor
                return

    def _buscar_valor(self, nome):
        """ retorna o valor de uma variável """
        for escopo in reversed(self.escopos):
            if nome in escopo:
                return escopo[nome]
        return None

    # --- Controle de Fluxo ---

    def visitPrograma(self, ctx:RexParser.ProgramaContext):
        return self.visitChildren(ctx)

    def visitBloco(self, ctx:RexParser.BlocoContext):
        self._entrar_escopo()
        self.visitChildren(ctx)
        self._sair_escopo()

    def visitDeclaracao(self, ctx:RexParser.DeclaracaoContext):
        nome = ctx.ID().getText()
        self.escopos[-1][nome] = None 
        return None

    def visitAtribuicao(self, ctx:RexParser.AtribuicaoContext):
        nome = ctx.ID().getText()
        valor = self.visit(ctx.expressao())
        self._buscar_var_e_atualizar(nome, valor)
        return valor

    def visitEstruturaIf(self, ctx:RexParser.EstruturaIfContext):
        condicao = self.visit(ctx.expressao())
        if condicao:
            self.visit(ctx.bloco(0))
        elif ctx.bloco(1):
            self.visit(ctx.bloco(1))
        return None

    def visitEstruturaWhile(self, ctx:RexParser.EstruturaWhileContext):
        while self.visit(ctx.expressao()):
            self.visit(ctx.bloco())
        return None

    def visitComandoIO(self, ctx:RexParser.ComandoIOContext):
        if ctx.expressao():
            valor = self.visit(ctx.expressao())
            print(valor)
        elif ctx.ID():
            nome = ctx.ID().getText()
            valor_lido = input()
            
            try:
                if '.' in valor_lido:
                    valor_lido = float(valor_lido)
                else:
                    valor_lido = int(valor_lido)
            except ValueError:
                pass

            self._buscar_var_e_atualizar(nome, valor_lido)
        return None

    # --- Expressões ---

    def visitExprAditiva(self, ctx:RexParser.ExprAditivaContext):
        esq = self.visit(ctx.expressao(0))
        dir = self.visit(ctx.expressao(1))
        if ctx.op.text == '+': return esq + dir
        if ctx.op.text == '-': return esq - dir

    def visitExprMultiplicativa(self, ctx:RexParser.ExprMultiplicativaContext):
        esq = self.visit(ctx.expressao(0))
        dir = self.visit(ctx.expressao(1))
        if ctx.op.text == '*': return esq * dir
        if ctx.op.text == '/': return esq / dir

    def visitExprRelacional(self, ctx:RexParser.ExprRelacionalContext):
        esq = self.visit(ctx.expressao(0))
        dir = self.visit(ctx.expressao(1))
        op = ctx.op.text
        if op == '>': return esq > dir
        if op == '<': return esq < dir
        if op == '==': return esq == dir
        if op == '!=': return esq != dir

    def visitExprLogicaE(self, ctx:RexParser.ExprLogicaEContext):
        return self.visit(ctx.expressao(0)) and self.visit(ctx.expressao(1))

    def visitExprLogicaOu(self, ctx:RexParser.ExprLogicaOuContext):
        return self.visit(ctx.expressao(0)) or self.visit(ctx.expressao(1))
    
    def visitExprNegacao(self, ctx:RexParser.ExprNegacaoContext):
        return not self.visit(ctx.expressao())

    def visitExprParenteses(self, ctx:RexParser.ExprParentesesContext):
        return self.visit(ctx.expressao())

    # --- Átomos ---

    def visitAtomId(self, ctx:RexParser.AtomIdContext):
        nome = ctx.ID().getText()
        return self._buscar_valor(nome)

    def visitAtomInt(self, ctx:RexParser.AtomIntContext):
        return int(ctx.getText())

    def visitAtomReal(self, ctx:RexParser.AtomRealContext):
        return float(ctx.getText())

    def visitAtomBooleanoTrue(self, ctx:RexParser.AtomBooleanoTrueContext):
        return True

    def visitAtomBooleanoFalse(self, ctx:RexParser.AtomBooleanoFalseContext):
        return False
    
    def visitAtomString(self, ctx:RexParser.AtomStringContext):
        texto_com_aspas = ctx.getText()
        return texto_com_aspas[1:-1]