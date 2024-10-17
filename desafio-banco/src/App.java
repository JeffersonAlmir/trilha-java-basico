import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupança;
import cliente.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Banco b = new Banco();
        Cliente cliente1 = new Cliente("jefferson", "1234");
        Cliente cliente2 = new Cliente("almir", "0012");
        Conta cc = new ContaCorrente( cliente1);
        Conta cc1 = new ContaPoupança( cliente2);
        b.adicionarConta(cc);
        b.adicionarConta(cc1);

        cc.depositar(1000);
        cc.transferir(500, cc1);
        cc.imprimirExtrato();
        cc1.imprimirExtrato();
        
        System.out.println(b.listaClientes());
         b.buscarCliente("0012");
       
        
    }
}
