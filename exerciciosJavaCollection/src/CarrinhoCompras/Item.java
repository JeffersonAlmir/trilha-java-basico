package CarrinhoCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;
    
    

    public  Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    public int getQuantidade() {
        return quantidade;
    }

    @Override
     //subcrição do método toString para formata e imprimir a lista com as tarefas e não os endereços de memória.
    public String toString(){
        return "{" + "Nome: '" + getNome() + '\''+  ", Preço: '" + getPreco() + '\''+  ", Quantidade: '" + getQuantidade() + '\''+ '}';
    }
    

}
