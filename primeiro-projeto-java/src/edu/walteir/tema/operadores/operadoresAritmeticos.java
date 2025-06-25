package edu.walteir.tema.operadores;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        //Utilizados para realizar operações matemáticas

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 20 % 2;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println(resultado);

        // Atenção: Quando o '+' é utilizado em variáveis do tipo STRING ele realiza a 'concatenação de textos'

        String primeiroNome = "Walteir";
        String segundoNome = "Coelho";
        String sobrenome = "de Freitas";

        String nomeCompleto = primeiroNome + " " + segundoNome + " " + sobrenome;
        System.out.println(nomeCompleto);

        String concat1 = 1+1+1+"1"; //Ele realiza o operador de soma enquanto identifica que o proximo valor é numérico. Apos identificar o texto, ele passa a concatenar
        System.out.println(concat1);

        String concat2 = 1+"1"+1+1; //Como ele identificou que o valor seguinte é um texto, todas as operações passa a ser concatenações
        System.out.println(concat2);

        String concat3 = 1+"1"+1+"1"; // Mesmo caso citado acima
        System.out.println(concat3);

        String concat4 = "1"+1+1+1; //Como o primeiro valor é um texto, ele utiliza o operador como concatenação, independentemente dos outros valores não serem texto
        System.out.println(concat4);

        String concat5 = "1"+(1+1+1); //Como os parenteses tem ordem de precedência, a soma é executada primeiro, mas quando passa pro texto, ele identifica o caracter e passa a realizar concatenação
        System.out.println(concat5);
    }
}
