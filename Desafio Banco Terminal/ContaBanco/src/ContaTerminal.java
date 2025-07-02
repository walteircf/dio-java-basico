import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha após o número da conta

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.nextLine(); // agora usamos nextLine aqui também

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine(); // aceita nome com espaços

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente 
                            + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia 
                            + ", conta " + numeroConta
                            + " e seu saldo de $" + saldo + " já está disponível para saque."
        );
        
    }
}
