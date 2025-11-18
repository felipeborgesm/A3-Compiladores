# Generated from Rex.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .RexParser import RexParser
else:
    from RexParser import RexParser

# This class defines a complete listener for a parse tree produced by RexParser.
class RexListener(ParseTreeListener):

    # Enter a parse tree produced by RexParser#programa.
    def enterPrograma(self, ctx:RexParser.ProgramaContext):
        pass

    # Exit a parse tree produced by RexParser#programa.
    def exitPrograma(self, ctx:RexParser.ProgramaContext):
        pass


    # Enter a parse tree produced by RexParser#comando.
    def enterComando(self, ctx:RexParser.ComandoContext):
        pass

    # Exit a parse tree produced by RexParser#comando.
    def exitComando(self, ctx:RexParser.ComandoContext):
        pass


    # Enter a parse tree produced by RexParser#bloco.
    def enterBloco(self, ctx:RexParser.BlocoContext):
        pass

    # Exit a parse tree produced by RexParser#bloco.
    def exitBloco(self, ctx:RexParser.BlocoContext):
        pass


    # Enter a parse tree produced by RexParser#declaracao.
    def enterDeclaracao(self, ctx:RexParser.DeclaracaoContext):
        pass

    # Exit a parse tree produced by RexParser#declaracao.
    def exitDeclaracao(self, ctx:RexParser.DeclaracaoContext):
        pass


    # Enter a parse tree produced by RexParser#tipo.
    def enterTipo(self, ctx:RexParser.TipoContext):
        pass

    # Exit a parse tree produced by RexParser#tipo.
    def exitTipo(self, ctx:RexParser.TipoContext):
        pass


    # Enter a parse tree produced by RexParser#atribuicao.
    def enterAtribuicao(self, ctx:RexParser.AtribuicaoContext):
        pass

    # Exit a parse tree produced by RexParser#atribuicao.
    def exitAtribuicao(self, ctx:RexParser.AtribuicaoContext):
        pass


    # Enter a parse tree produced by RexParser#estruturaIf.
    def enterEstruturaIf(self, ctx:RexParser.EstruturaIfContext):
        pass

    # Exit a parse tree produced by RexParser#estruturaIf.
    def exitEstruturaIf(self, ctx:RexParser.EstruturaIfContext):
        pass


    # Enter a parse tree produced by RexParser#estruturaWhile.
    def enterEstruturaWhile(self, ctx:RexParser.EstruturaWhileContext):
        pass

    # Exit a parse tree produced by RexParser#estruturaWhile.
    def exitEstruturaWhile(self, ctx:RexParser.EstruturaWhileContext):
        pass


    # Enter a parse tree produced by RexParser#comandoIO.
    def enterComandoIO(self, ctx:RexParser.ComandoIOContext):
        pass

    # Exit a parse tree produced by RexParser#comandoIO.
    def exitComandoIO(self, ctx:RexParser.ComandoIOContext):
        pass


    # Enter a parse tree produced by RexParser#exprAtom.
    def enterExprAtom(self, ctx:RexParser.ExprAtomContext):
        pass

    # Exit a parse tree produced by RexParser#exprAtom.
    def exitExprAtom(self, ctx:RexParser.ExprAtomContext):
        pass


    # Enter a parse tree produced by RexParser#exprLogicaE.
    def enterExprLogicaE(self, ctx:RexParser.ExprLogicaEContext):
        pass

    # Exit a parse tree produced by RexParser#exprLogicaE.
    def exitExprLogicaE(self, ctx:RexParser.ExprLogicaEContext):
        pass


    # Enter a parse tree produced by RexParser#exprAditiva.
    def enterExprAditiva(self, ctx:RexParser.ExprAditivaContext):
        pass

    # Exit a parse tree produced by RexParser#exprAditiva.
    def exitExprAditiva(self, ctx:RexParser.ExprAditivaContext):
        pass


    # Enter a parse tree produced by RexParser#exprLogicaOu.
    def enterExprLogicaOu(self, ctx:RexParser.ExprLogicaOuContext):
        pass

    # Exit a parse tree produced by RexParser#exprLogicaOu.
    def exitExprLogicaOu(self, ctx:RexParser.ExprLogicaOuContext):
        pass


    # Enter a parse tree produced by RexParser#exprRelacional.
    def enterExprRelacional(self, ctx:RexParser.ExprRelacionalContext):
        pass

    # Exit a parse tree produced by RexParser#exprRelacional.
    def exitExprRelacional(self, ctx:RexParser.ExprRelacionalContext):
        pass


    # Enter a parse tree produced by RexParser#exprNegacao.
    def enterExprNegacao(self, ctx:RexParser.ExprNegacaoContext):
        pass

    # Exit a parse tree produced by RexParser#exprNegacao.
    def exitExprNegacao(self, ctx:RexParser.ExprNegacaoContext):
        pass


    # Enter a parse tree produced by RexParser#exprMultiplicativa.
    def enterExprMultiplicativa(self, ctx:RexParser.ExprMultiplicativaContext):
        pass

    # Exit a parse tree produced by RexParser#exprMultiplicativa.
    def exitExprMultiplicativa(self, ctx:RexParser.ExprMultiplicativaContext):
        pass


    # Enter a parse tree produced by RexParser#exprParenteses.
    def enterExprParenteses(self, ctx:RexParser.ExprParentesesContext):
        pass

    # Exit a parse tree produced by RexParser#exprParenteses.
    def exitExprParenteses(self, ctx:RexParser.ExprParentesesContext):
        pass


    # Enter a parse tree produced by RexParser#atomInt.
    def enterAtomInt(self, ctx:RexParser.AtomIntContext):
        pass

    # Exit a parse tree produced by RexParser#atomInt.
    def exitAtomInt(self, ctx:RexParser.AtomIntContext):
        pass


    # Enter a parse tree produced by RexParser#atomReal.
    def enterAtomReal(self, ctx:RexParser.AtomRealContext):
        pass

    # Exit a parse tree produced by RexParser#atomReal.
    def exitAtomReal(self, ctx:RexParser.AtomRealContext):
        pass


    # Enter a parse tree produced by RexParser#atomBooleanoTrue.
    def enterAtomBooleanoTrue(self, ctx:RexParser.AtomBooleanoTrueContext):
        pass

    # Exit a parse tree produced by RexParser#atomBooleanoTrue.
    def exitAtomBooleanoTrue(self, ctx:RexParser.AtomBooleanoTrueContext):
        pass


    # Enter a parse tree produced by RexParser#atomBooleanoFalse.
    def enterAtomBooleanoFalse(self, ctx:RexParser.AtomBooleanoFalseContext):
        pass

    # Exit a parse tree produced by RexParser#atomBooleanoFalse.
    def exitAtomBooleanoFalse(self, ctx:RexParser.AtomBooleanoFalseContext):
        pass


    # Enter a parse tree produced by RexParser#atomId.
    def enterAtomId(self, ctx:RexParser.AtomIdContext):
        pass

    # Exit a parse tree produced by RexParser#atomId.
    def exitAtomId(self, ctx:RexParser.AtomIdContext):
        pass


    # Enter a parse tree produced by RexParser#atomString.
    def enterAtomString(self, ctx:RexParser.AtomStringContext):
        pass

    # Exit a parse tree produced by RexParser#atomString.
    def exitAtomString(self, ctx:RexParser.AtomStringContext):
        pass



del RexParser