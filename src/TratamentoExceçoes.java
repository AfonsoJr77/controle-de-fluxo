import java.util.Locale;
import java.util.Scanner;

public class TratamentoExceçoes {
    public static void main(String[] args) {
      try{ 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Conta criada com sucesso!");

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
      }
      catch(java.util.InputMismatchException e) {
        System.out.println("Os campos número e agência devem ser inteiros.");
      }
           
    }
}
