# Generated from Rex.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .RexParser import RexParser
else:
    from RexParser import RexParser

# This class defines a complete generic visitor for a parse tree produced by RexParser.

class RexVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by RexParser#programa.
    def visitPrograma(self, ctx:RexParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#comando.
    def visitComando(self, ctx:RexParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#bloco.
    def visitBloco(self, ctx:RexParser.BlocoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#declaracao.
    def visitDeclaracao(self, ctx:RexParser.DeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#tipo.
    def visitTipo(self, ctx:RexParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#atribuicao.
    def visitAtribuicao(self, ctx:RexParser.AtribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#estruturaIf.
    def visitEstruturaIf(self, ctx:RexParser.EstruturaIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#estruturaWhile.
    def visitEstruturaWhile(self, ctx:RexParser.EstruturaWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#comandoIO.
    def visitComandoIO(self, ctx:RexParser.ComandoIOContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprAtom.
    def visitExprAtom(self, ctx:RexParser.ExprAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprLogicaE.
    def visitExprLogicaE(self, ctx:RexParser.ExprLogicaEContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprAditiva.
    def visitExprAditiva(self, ctx:RexParser.ExprAditivaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprLogicaOu.
    def visitExprLogicaOu(self, ctx:RexParser.ExprLogicaOuContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprRelacional.
    def visitExprRelacional(self, ctx:RexParser.ExprRelacionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprNegacao.
    def visitExprNegacao(self, ctx:RexParser.ExprNegacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprMultiplicativa.
    def visitExprMultiplicativa(self, ctx:RexParser.ExprMultiplicativaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#exprParenteses.
    def visitExprParenteses(self, ctx:RexParser.ExprParentesesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#atomInt.
    def visitAtomInt(self, ctx:RexParser.AtomIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#atomReal.
    def visitAtomReal(self, ctx:RexParser.AtomRealContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#atomBooleanoTrue.
    def visitAtomBooleanoTrue(self, ctx:RexParser.AtomBooleanoTrueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#atomBooleanoFalse.
    def visitAtomBooleanoFalse(self, ctx:RexParser.AtomBooleanoFalseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#atomId.
    def visitAtomId(self, ctx:RexParser.AtomIdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RexParser#atomString.
    def visitAtomString(self, ctx:RexParser.AtomStringContext):
        return self.visitChildren(ctx)



del RexParser