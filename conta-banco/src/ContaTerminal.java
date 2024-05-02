import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite número da agência");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome");
        String usuario = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta: " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
