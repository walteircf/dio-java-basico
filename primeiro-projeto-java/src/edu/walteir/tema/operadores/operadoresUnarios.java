package edu.walteir.tema.operadores;

public class operadoresUnarios {
    // São utilizados juntamente com um outro operador aritmetico para incrementar, decrementar, inverter valores e booleans

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero); //operador unario para tornar o numero negativo, mas altera apenas o resultado, nao a variavel
        System.out.println(numero);

        //Para alterar a variavel para negativo é necessário:
        numero = - numero;
        System.out.println(numero);
        
        //Para torná-lo positivo novamente é necessário:
        numero = numero * -1;
        System.out.println(numero);

        numero++; //operador unario que incrementa a variavel
        System.out.println(numero); 

        numero = 10;
        System.out.println(numero);
        numero--; //valor unario que decrementa a variável
        System.out.println(numero);

    }
}
