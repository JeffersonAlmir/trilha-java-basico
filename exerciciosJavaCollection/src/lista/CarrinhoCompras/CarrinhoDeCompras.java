package lista.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarCarrinho(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for (Item item : itemList) {
                if( item.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(item);
                }
            }
            itemList.removeAll(itemParaRemover);
        }
        else{
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if(itemList.isEmpty()){
            throw new RuntimeException("A lista está vazia");
        } else {
            for (Item item : itemList) {
                double valorItem = (item.getPreco()* item.getQuantidade());
                valorTotal += valorItem;
            }

        }
        return valorTotal;
    }

    public void exibirItem(){
        if(!itemList.isEmpty()){
            System.out.println(itemList);
        } else{
            System.out.println("A lista está vazia.");
        }
    }

    
    


}
