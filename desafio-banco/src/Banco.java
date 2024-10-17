import java.util.ArrayList;
import java.util.List;

import Conta.Conta;
import cliente.Cliente;

public class Banco {

    private String nomeBanco;
    private List <Conta> listaConta;


    public Banco() {
        this.nomeBanco = "Novo Banco";
        this.listaConta = new ArrayList<>();
    }
    public List<Conta> getConta() {
        return listaConta;
    }
    
    public void setConta(List<Conta> listaConta) {
        this.listaConta = listaConta;
    }

    public String getNome() {
        return nomeBanco;
    }

    public void adicionarConta (Conta conta){
        this.listaConta.add(conta);
    }
    
    public List<Cliente> listaClientes (){
        List<Cliente> clienteList = new ArrayList<>();
        for (Conta c : listaConta){
            clienteList.add( c.getCliente());
        }
        return clienteList;
    }

    public void buscarCliente(String cpf){ 
        for( Conta c : listaConta){
            if(c.getCliente().getCpf().equals(cpf)){
                System.out.println("*** Informaçôes***");
                c.imprimirInformacao();
                System.out.println("---------------------");
                break;
            }
        }
        
    }   

    
}