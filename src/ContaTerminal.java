import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite o saldo que deseja depositar: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);
    }
}
