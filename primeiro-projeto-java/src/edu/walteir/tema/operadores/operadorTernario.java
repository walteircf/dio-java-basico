package edu.walteir.tema.operadores;

public class operadorTernario {
// É uma forma resumida de definir uma condição de escolha entre valores, como uma estrutura "if/else", mas escrita em apenas uma linha
    public static void main(String[] args) {
        //<expressão condicional> ? <condição se for verdafeiro> : <condição se for falsa>:
        int a, b, c;

        a = 8;
        b = 50;
        c = 7;

        String resultado = a < b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        //No caso de mais de 2 valores
        //<expressão condicional 1> ? <condição se verdadeiro : <expressão condicional 2> ? < expressão se verdadeiro> : <condição se ambas falsas>

        String maior = a > b && a > c ? "a é o maior" : b > c && b > a ? "b é o maior" : "c é o maior";

        System.out.println(maior);
    }
}
