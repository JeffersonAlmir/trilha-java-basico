package Conta;

import cliente.Cliente;

public class ContaPoupança extends Conta  {
 
    public ContaPoupança(Cliente cliente) {
        super(cliente);
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança***");
        super.imprimirInformacao();
        System.out.println("--------------------------------\n");
    }
    
}
