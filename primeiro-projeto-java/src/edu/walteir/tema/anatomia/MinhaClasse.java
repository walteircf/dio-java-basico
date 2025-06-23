package edu.walteir.tema.anatomia;
public class MinhaClasse {

    final int ESTADOS_BRASILEIROS = 27;
    public static void main(String[] args) {
        String primeiroNome = "Walteir";
        
        String segundoNome = "Coelho";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
