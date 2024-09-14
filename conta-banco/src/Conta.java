public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String agencia, String nomeCliente){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo =  0.0;
    }
    // Getters
    public int getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public double getSaldo(){
        return this.saldo;
    }
    //Set
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public void depositar(double valor){
            this.setSaldo(valor);
    }
}

