import sys
from antlr4 import *
from MyLangLexer import MyLangLexer
from MyLangParser import MyLangParser
from MyLangChecker import MyLangChecker, ErroSemantico

def main(argv):
    if len(argv) < 2:
        print("Uso: python main.py <arquivo_fonte.mylang>")
        return

    input_stream = FileStream(argv[1], encoding='utf-8')
    
    # 1. Lexer
    lexer = MyLangLexer(input_stream)
    stream = CommonTokenStream(lexer)
    
    # 2. Parser
    parser = MyLangParser(stream)
    
    try:
        tree = parser.programa()
        
        print(f"Análise Sintática Concluída com Sucesso para: {argv[1]}\n")

        # ===================================================================
        # DEMONSTRAÇÃO DA ÁRVORE DE ANÁLISE (PARSE TREE)
        # ===================================================================
        print("--- Árvore de Análise (Parse Tree LISP-style) ---")
        # O 'recog=parser' é essencial para obter os nomes das regras
        print(tree.toStringTree(recog=parser))
        print("---------------------------------------------------\n")

        
        # ===================================================================
        # PASSO 3: Análise Semântica (Verificação de Tipos e Escopo)
        # ===================================================================
        print("Iniciando Análise Semântica (Tipos e Escopo)...")
        checker = MyLangChecker()
        checker.visit(tree)
        
        print("\nAnálise Semântica Concluída com Sucesso.")
        print("Todos os tipos e escopos estão corretos.")

    except ErroSemantico as e:
        print(e)
        
    except Exception as e:
        print(f"Ocorreu um erro: {e}")

if __name__ == '__main__':
    main(sys.argv)