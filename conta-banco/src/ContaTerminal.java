import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //to do: conhecer e importar a classe scanner
        // to do: exibir as mensagens para o usuário
        // obter pela classe scanner os valores digitados no terminal
        // exibir a mensagem da conta criada
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();

        System.out.println("Digite seu saldo atual");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + ". Seu saldo de R$" + saldo + " já está disponível para saque.");




    }
}
