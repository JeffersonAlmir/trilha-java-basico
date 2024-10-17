
package Conta;

import cliente.Cliente;

public abstract class Conta  {
    private static final int AGENCIA_PADRAO  = 3;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta( Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public Cliente getCliente() {
        return cliente;
    }



    public void sacar(double valor){
        if(valor > this.saldo ){
            throw new IllegalArgumentException ("Valor Inválido!");
        } else{
            this.saldo -=valor;
        }
    }
    public  void depositar(double valor){
        if(valor < 0.0 ){
            throw new IllegalArgumentException ("Valor Inválido!");
        } else{
            this.saldo +=valor;
        }
    }
    public  void transferir(double valor, Conta contaDestino){
        if ( valor > this.saldo){
            throw new IllegalArgumentException ("Valor Inválido!");
        } else{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public void imprimirInformacao() {
        System.out.println("Cliente: " +this.cliente.getNome());
        System.out.printf("Agencia: %d \n",this.agencia);
        System.out.printf("Numero: %d \n",this.numero);
        System.out.printf("Saldo: %.2f\n",this.saldo);
    }
    
    public abstract void imprimirExtrato();
    


    



    
    
}
