import java.util.Locale;
import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o seu nome completo:");
        String nomeCompleto = scanner.next();
        System.out.println("digite o numero da agencia:");
        String agencia = scanner.next();
        System.out.println("digite o numero da conta:");
        int conta = scanner.nextInt();
        System.out.println("digite seu saldo:");
        double saldo = scanner.nextDouble();
        
        System.out.println("Novo cliente " + nomeCompleto + " sua conta no banco ja foi aberta com sucesso ");
        System.out.println("Numero da sua agencia é " + agencia);
        System.out.println("Numero da sua conta é " + conta);
        System.out.println("Seu saldo disponivel é de " + saldo); 

    }
}
