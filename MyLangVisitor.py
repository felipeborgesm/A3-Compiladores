# Generated from MyLang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MyLangParser import MyLangParser
else:
    from MyLangParser import MyLangParser

# This class defines a complete generic visitor for a parse tree produced by MyLangParser.

class MyLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyLangParser#programa.
    def visitPrograma(self, ctx:MyLangParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#comando.
    def visitComando(self, ctx:MyLangParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#bloco.
    def visitBloco(self, ctx:MyLangParser.BlocoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#declaracao.
    def visitDeclaracao(self, ctx:MyLangParser.DeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#tipo.
    def visitTipo(self, ctx:MyLangParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#atribuicao.
    def visitAtribuicao(self, ctx:MyLangParser.AtribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#estruturaIf.
    def visitEstruturaIf(self, ctx:MyLangParser.EstruturaIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#estruturaWhile.
    def visitEstruturaWhile(self, ctx:MyLangParser.EstruturaWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#comandoIO.
    def visitComandoIO(self, ctx:MyLangParser.ComandoIOContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprAtom.
    def visitExprAtom(self, ctx:MyLangParser.ExprAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprLogicaE.
    def visitExprLogicaE(self, ctx:MyLangParser.ExprLogicaEContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprAditiva.
    def visitExprAditiva(self, ctx:MyLangParser.ExprAditivaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprLogicaOu.
    def visitExprLogicaOu(self, ctx:MyLangParser.ExprLogicaOuContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprRelacional.
    def visitExprRelacional(self, ctx:MyLangParser.ExprRelacionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprNegacao.
    def visitExprNegacao(self, ctx:MyLangParser.ExprNegacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprMultiplicativa.
    def visitExprMultiplicativa(self, ctx:MyLangParser.ExprMultiplicativaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exprParenteses.
    def visitExprParenteses(self, ctx:MyLangParser.ExprParentesesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#atomInt.
    def visitAtomInt(self, ctx:MyLangParser.AtomIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#atomReal.
    def visitAtomReal(self, ctx:MyLangParser.AtomRealContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#atomBooleanoTrue.
    def visitAtomBooleanoTrue(self, ctx:MyLangParser.AtomBooleanoTrueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#atomBooleanoFalse.
    def visitAtomBooleanoFalse(self, ctx:MyLangParser.AtomBooleanoFalseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#atomId.
    def visitAtomId(self, ctx:MyLangParser.AtomIdContext):
        return self.visitChildren(ctx)



del MyLangParser