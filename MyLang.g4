grammar MyLang;

programa: (comando)* EOF;

comando
    : declaracao
    | atribuicao
    | estruturaIf
    | estruturaWhile
    | comandoIO
    | bloco
    ;

bloco
    : '{' (comando)* '}'
    ;

// Req 1: Tipos de Variáveis (inteiro, real, booleano)
declaracao
    : tipo ID ';'
    ;

tipo
    : 'inteiro'
    | 'real'
    | 'booleano'
    ;

// Req 5: Atribuição
atribuicao
    : ID '=' expressao ';'
    ;

// Req 2: Estrutura Condicional (if/else)
estruturaIf
    : 'se' '(' expressao ')' bloco ('senao' bloco)?
    ;

// Req 3: Estrutura de Repetição (while)
estruturaWhile
    : 'enquanto' '(' expressao ')' bloco
    ;

// Req 6: Entrada e Saída
comandoIO
    : 'escreva' '(' expressao ')' ';'
    | 'leia' '(' ID ')' ';'
    ;

// Req 4: Expressões Aritméticas (com precedência)
expressao
    : expressao op='ou' expressao                     # exprLogicaOu
    | expressao op='e' expressao                      # exprLogicaE
    | expressao op=('>' | '<' | '==' | '!=') expressao  # exprRelacional
    | expressao op=('+' | '-') expressao                # exprAditiva
    | expressao op=('*' | '/') expressao                # exprMultiplicativa
    | '!' expressao                                  # exprNegacao
    | atom                                           # exprAtom
    ;

atom
    : '(' expressao ')'    # exprParenteses
    | NUM_INT            # atomInt
    | NUM_REAL           # atomReal
    | 'verdadeiro'       # atomBooleanoTrue
    | 'falso'            # atomBooleanoFalse
    | ID                 # atomId
    ;

// Identificador (nome de variável)
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

// Números
NUM_INT: [0-9]+;
NUM_REAL: [0-9]+ '.' [0-9]+;

// Req 7: Tokens Descartados (Espaços, tabs, quebras de linha)
WS: [ \t\r\n]+ -> skip;

COMENTARIO_LINHA: '//' .*? '\n' -> skip;
COMENTARIO_BLOCO: '/*' .*? '*/' -> skip;// Define o nome da gramática. O ANTLR gerará arquivos como MyLangLexer.py, MyLangParser.py, etc.
