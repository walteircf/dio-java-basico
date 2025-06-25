package edu.walteir.tema.operadores;

public class operadoresRelacionais {
// Operadores relacionais avaliam a relação entre duas variáveis ou expressões.
    public static void main(String[] args) {
        int a, b, c;

        a = 7;
        b = 7;
        c = 5;

        if (a > b) {
            System.out.println("a é maior");
        }
        if (a < b) {
            System.out.println("a é menor");
        }
        if (a == b) {
            System.out.println("a é igual a b");
        } 
     
        if (a >= c) {
            System.out.println("a é maior ou igual a c");
        }
        if (a <= c) {
            System.out.println("a é menor ou igual a c");
        }

        if (a != b) {
            System.out.println("a é diferente de b");
        }
        
        String nome1 = "Heloisa";
        String nome2 = "Heloisa";

        System.out.println(nome1 == nome2 ? "Conteúdo igual" : "Conteúdo diferente"); //é possível comparar conteúdo
    
        String nomeUm = "Walteir";
        String nomeDois = new String("Walteir");

        System.out.println(nomeUm.equals(nomeDois) ? "Conteúdo igual" : "Conteúdo diferente"); //para comparar objetos ou textos, é necessário utilizar a função ".equals()" como no exemplo, passando uma variável.equals(outraVariavel)

    }
}
