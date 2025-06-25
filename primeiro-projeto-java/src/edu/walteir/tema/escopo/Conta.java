package edu.walteir.tema.escopo;

public class Conta {
    double saldo = 500.00; //variável visível em toda classe

    public void sacar(double valor) {
        double novoSaldo = saldo - valor; //variável visível apenas dentro do método
    }

    public void mostrarSaldo() {
        System.out.println(saldo); 
        //System.out.println(novoSaldo); //não permitido, pois a variável não tem visibilidade em toda a classe
    }

    public double calcularDividaExponencial() {
        double valorParcela = 50.0; //variável local
        double valorMontante = 0.0;
        for (int x=1; x<=5; x++) {
            double valorCalculado = valorParcela * x; // x e valorCalculado são variável de escopo, e só existem dentro do loop
            valorMontante += valorCalculado;
        }

        return valorMontante;
    }
}
