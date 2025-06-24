package edu.walteir.tema.variaveis;

public class tiposDeVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500.30;
        float novoSalario = 2800.50f; //ao declarar float é necessario incrementar o 'f' ao final

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //só é possivel fazendo CAST
        long cpf = 50702351172l; //também é necessário incrementar o 'L' ao final para identificar o LONG

        final int NUMERO = 5; //Para declarar uma constante, deve-se declarar o "final" antes da tipagem

        // NUMERO = 10; não é possivel alterar a constante
        System.out.println(NUMERO);
    }

    
}
