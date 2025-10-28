# Generated from MyLang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MyLangParser import MyLangParser
else:
    from MyLangParser import MyLangParser

# This class defines a complete listener for a parse tree produced by MyLangParser.
class MyLangListener(ParseTreeListener):

    # Enter a parse tree produced by MyLangParser#programa.
    def enterPrograma(self, ctx:MyLangParser.ProgramaContext):
        pass

    # Exit a parse tree produced by MyLangParser#programa.
    def exitPrograma(self, ctx:MyLangParser.ProgramaContext):
        pass


    # Enter a parse tree produced by MyLangParser#comando.
    def enterComando(self, ctx:MyLangParser.ComandoContext):
        pass

    # Exit a parse tree produced by MyLangParser#comando.
    def exitComando(self, ctx:MyLangParser.ComandoContext):
        pass


    # Enter a parse tree produced by MyLangParser#bloco.
    def enterBloco(self, ctx:MyLangParser.BlocoContext):
        pass

    # Exit a parse tree produced by MyLangParser#bloco.
    def exitBloco(self, ctx:MyLangParser.BlocoContext):
        pass


    # Enter a parse tree produced by MyLangParser#declaracao.
    def enterDeclaracao(self, ctx:MyLangParser.DeclaracaoContext):
        pass

    # Exit a parse tree produced by MyLangParser#declaracao.
    def exitDeclaracao(self, ctx:MyLangParser.DeclaracaoContext):
        pass


    # Enter a parse tree produced by MyLangParser#tipo.
    def enterTipo(self, ctx:MyLangParser.TipoContext):
        pass

    # Exit a parse tree produced by MyLangParser#tipo.
    def exitTipo(self, ctx:MyLangParser.TipoContext):
        pass


    # Enter a parse tree produced by MyLangParser#atribuicao.
    def enterAtribuicao(self, ctx:MyLangParser.AtribuicaoContext):
        pass

    # Exit a parse tree produced by MyLangParser#atribuicao.
    def exitAtribuicao(self, ctx:MyLangParser.AtribuicaoContext):
        pass


    # Enter a parse tree produced by MyLangParser#estruturaIf.
    def enterEstruturaIf(self, ctx:MyLangParser.EstruturaIfContext):
        pass

    # Exit a parse tree produced by MyLangParser#estruturaIf.
    def exitEstruturaIf(self, ctx:MyLangParser.EstruturaIfContext):
        pass


    # Enter a parse tree produced by MyLangParser#estruturaWhile.
    def enterEstruturaWhile(self, ctx:MyLangParser.EstruturaWhileContext):
        pass

    # Exit a parse tree produced by MyLangParser#estruturaWhile.
    def exitEstruturaWhile(self, ctx:MyLangParser.EstruturaWhileContext):
        pass


    # Enter a parse tree produced by MyLangParser#comandoIO.
    def enterComandoIO(self, ctx:MyLangParser.ComandoIOContext):
        pass

    # Exit a parse tree produced by MyLangParser#comandoIO.
    def exitComandoIO(self, ctx:MyLangParser.ComandoIOContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprAtom.
    def enterExprAtom(self, ctx:MyLangParser.ExprAtomContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprAtom.
    def exitExprAtom(self, ctx:MyLangParser.ExprAtomContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprLogicaE.
    def enterExprLogicaE(self, ctx:MyLangParser.ExprLogicaEContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprLogicaE.
    def exitExprLogicaE(self, ctx:MyLangParser.ExprLogicaEContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprAditiva.
    def enterExprAditiva(self, ctx:MyLangParser.ExprAditivaContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprAditiva.
    def exitExprAditiva(self, ctx:MyLangParser.ExprAditivaContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprLogicaOu.
    def enterExprLogicaOu(self, ctx:MyLangParser.ExprLogicaOuContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprLogicaOu.
    def exitExprLogicaOu(self, ctx:MyLangParser.ExprLogicaOuContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprRelacional.
    def enterExprRelacional(self, ctx:MyLangParser.ExprRelacionalContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprRelacional.
    def exitExprRelacional(self, ctx:MyLangParser.ExprRelacionalContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprNegacao.
    def enterExprNegacao(self, ctx:MyLangParser.ExprNegacaoContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprNegacao.
    def exitExprNegacao(self, ctx:MyLangParser.ExprNegacaoContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprMultiplicativa.
    def enterExprMultiplicativa(self, ctx:MyLangParser.ExprMultiplicativaContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprMultiplicativa.
    def exitExprMultiplicativa(self, ctx:MyLangParser.ExprMultiplicativaContext):
        pass


    # Enter a parse tree produced by MyLangParser#exprParenteses.
    def enterExprParenteses(self, ctx:MyLangParser.ExprParentesesContext):
        pass

    # Exit a parse tree produced by MyLangParser#exprParenteses.
    def exitExprParenteses(self, ctx:MyLangParser.ExprParentesesContext):
        pass


    # Enter a parse tree produced by MyLangParser#atomInt.
    def enterAtomInt(self, ctx:MyLangParser.AtomIntContext):
        pass

    # Exit a parse tree produced by MyLangParser#atomInt.
    def exitAtomInt(self, ctx:MyLangParser.AtomIntContext):
        pass


    # Enter a parse tree produced by MyLangParser#atomReal.
    def enterAtomReal(self, ctx:MyLangParser.AtomRealContext):
        pass

    # Exit a parse tree produced by MyLangParser#atomReal.
    def exitAtomReal(self, ctx:MyLangParser.AtomRealContext):
        pass


    # Enter a parse tree produced by MyLangParser#atomBooleanoTrue.
    def enterAtomBooleanoTrue(self, ctx:MyLangParser.AtomBooleanoTrueContext):
        pass

    # Exit a parse tree produced by MyLangParser#atomBooleanoTrue.
    def exitAtomBooleanoTrue(self, ctx:MyLangParser.AtomBooleanoTrueContext):
        pass


    # Enter a parse tree produced by MyLangParser#atomBooleanoFalse.
    def enterAtomBooleanoFalse(self, ctx:MyLangParser.AtomBooleanoFalseContext):
        pass

    # Exit a parse tree produced by MyLangParser#atomBooleanoFalse.
    def exitAtomBooleanoFalse(self, ctx:MyLangParser.AtomBooleanoFalseContext):
        pass


    # Enter a parse tree produced by MyLangParser#atomId.
    def enterAtomId(self, ctx:MyLangParser.AtomIdContext):
        pass

    # Exit a parse tree produced by MyLangParser#atomId.
    def exitAtomId(self, ctx:MyLangParser.AtomIdContext):
        pass



del MyLangParser