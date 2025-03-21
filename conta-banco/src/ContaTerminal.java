import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis para armazenar os dados
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();  

        scanner.nextLine();  

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble(); 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
