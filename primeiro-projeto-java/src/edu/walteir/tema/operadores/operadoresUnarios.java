package edu.walteir.tema.operadores;

public class operadoresUnarios {
    // São utilizados juntamente com um outro operador aritmetico para incrementar, decrementar, inverter valores e booleans

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero); //operador unario para tornar o numero negativo, mas altera apenas em memoria, nao a variavel
        System.out.println(numero);

        //Para alterar a variavel para negativo é necessário:
        numero = - numero;
        System.out.println(numero);
        
        //Para torná-lo positivo novamente é necessário:
        numero = numero * -1;
        System.out.println(numero);

        ++numero; //operador unario que incrementa a variavel
        numero++; //apresenta o numero e o incrementa depois
        System.out.println(numero); 

        numero = 10;
        System.out.println(numero);
        numero--; //valor unario que decrementa a variável
        System.out.println(numero);

        //Para incrementar valores de 2 ou mais usamos:
        numero += 3; //incrementa 3
        numero *= 2; 
        numero -= 2;
        numero /= 2;

    }
}
