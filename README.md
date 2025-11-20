# A3 - Compiladores

### Membros do grupo

- Carlos Felipe Borges Mesquita - 12522138056
- Gabriel Luz Carbonaro - 12524120447
- Guilherme Rechiguel - 12522159171
- Jackson da Costa Souza - 125221102685
- Pedro Henrique Machado - 12522192958

## Para rodar o projeto

### Baixe o JAR do ANTLR4 e mova o .jar para o repositório (já está presente)

> https://www.antlr.org/download.html

### Instale a biblioteca do ANTLR4

```
pip install antlr4-python3-runtime
```

### Gere ou atualize os arquivos de sintaxe da linguagem (já estão no repositório)
```
java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 Rex.g4

java -jar antlr-4.13.2-complete.jar -o java_debugger -no-listener -no-visitor Rex.g4

javac -cp ".;antlr-4.13.2-complete.jar" java_debugger/*.java
```

### Usando os arquivos de teste (estão na pasta testes)
- Gerar árvore sintática:
```
java -cp "java_debugger;antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig Rex programa -gui testes/NOME_DO_ARQUIVO_DE_TESTE.rex
```

- Gerar output no terminal:
```
python main.py testes/NOME_DO_ARQUIVO_DE_TESTE.rex
```
