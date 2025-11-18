# A3 - Compiladores

### Membros do grupo

- Carlos Felipe Borges Mesquita - 12522138056
- Gabriel Luz Carbonaro - 12524120447
- Guilherme Rechiguel - 12522159171
- Jackson da Costa Souza - 125221102685
- Pedro Henrique Machado - 12522192958

## Para rodar o projeto

### Baixe o JAR do ANTLR4 (já está no repositório)

> https://www.antlr.org/download.html

### Instale a biblioteca do ANTLR4

```
pip install antlr4-python3-runtime
```

### Gerar os arquivos (já estão no repositório) ou atualizar caso mude a linguagem

```
java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 Rex.g4
```

### Para usar o arquivo de teste

```
python main.py teste.rex
```
