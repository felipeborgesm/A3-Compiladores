// Demonstração da linguagem

// Req 1 e 5: Declarações e Atribuições
inteiro x;
real y;
booleano pronto;
texto nome;

escreva('--- Inicio do Programa ---');
texto mensagem;
mensagem = 'Ola, mundo armazenado!';

escreva(mensagem);

mensagem = 'Mudando o texto...';
escreva(mensagem);

x = 10;
y = 5.5 + (x * 2); // Req 4: Precedência de operadores
pronto = verdadeiro;

// Req 6: Saída
escreva(y); // Deve escrever 25.5
escreva(pronto); // Deve escrever True

// Req 2: Estrutura Condicional
escreva('testando se e senao');
se (pronto e (x > 5)) {
    escreva(1); // true
} senao {
    escreva(0); // false
}

se (y > 10) {
    escreva('Resultado alto!');
} senao {
    escreva('Resultado baixo.'); 
}

// Req 3: Estrutura de Repetição
inteiro contador;
contador = 0;
enquanto (contador < 3) {
    escreva(contador);
    contador = contador + 1;
}

// Req 6: Entrada
escreva(999);
escreva('Digite um valor para x:');
leia(x);
escreva(x);

{
    inteiro x;
    x = 100;
    escreva(x);
}
escreva(x);

// Exemplo de ERRO DE TIPO (será pego pelo RexChecker) DESCOMENTE PARA TESTAR O ERRO
// y = 10 + falso;

escreva('--- Fim ---');