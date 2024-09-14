import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = sc.nextLine();
        
        
        Conta c1 = new Conta(numeroConta, agencia, nomeCliente);
        System.out.println("Por favor, digite o valor do deposito !");
        double valor = sc.nextDouble();
        c1.depositar(valor);

        sc.close();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", 
                  c1.getNomeCliente(), c1.getAgencia(), c1.getNumero(), c1.getSaldo());
    }
}