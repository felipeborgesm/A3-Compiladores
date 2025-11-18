import sys
from antlr4 import *
from RexLexer import RexLexer
from RexParser import RexParser
from RexChecker import RexChecker
from RexInterpreter import RexInterpreter

def main(argv):
    if len(argv) < 2:
        print("Uso: python main.py <arquivo_fonte.rex>")
        return

    input_stream = FileStream(argv[1], encoding='utf-8')
    lexer = RexLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = RexParser(stream)
    
    try:
        tree = parser.programa()
        
        print(f"Análise Sintática Concluída com Sucesso para: {argv[1]}\n")

        # 1. Árvore de Análise (PARSE TREE)
        print("--- Árvore de Análise (Parse Tree LISP-style) ---")
        print(tree.toStringTree(recog=parser))
        print("Análise Sintática: OK")
        print("-" * 40)

        # 2. Análise Semântica (Verifica Tipos)
        print("Análise Semântica: Verificando...")
        checker = RexChecker()
        checker.visit(tree) 
        print("Análise Semântica: OK (Nenhum erro encontrado)")
        print("-" * 40)
        print("EXECUTANDO O PROGRAMA:")
        print("-" * 40)

        # 3. Interpretação (Executa o código)
        interpreter = RexInterpreter()
        interpreter.visit(tree)

    except Exception as e:
        print(f"\n[ERRO DE COMPILAÇÃO]: {e}")
        print("O programa não pode ser executado devido a erros semânticos.")
        
    except Exception as e:
        print(f"Ocorreu um erro inesperado: {e}")

if __name__ == '__main__':
    main(sys.argv)