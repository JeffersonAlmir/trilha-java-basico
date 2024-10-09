package CarrinhoCompras;

public class Teste {
    public static void main(String[] args) {
        CarrinhoDeCompras lista = new CarrinhoDeCompras();
        lista.adicionarCarrinho("copo", 10, 2);
        lista.adicionarCarrinho("sabonete", 4.89, 2);
        lista.adicionarCarrinho("Lápis", 2.50, 3);
        System.out.println(lista.calcularValorTotal());
        lista.exibirItem();

        lista.removerItem("copo");
        lista.exibirItem();
        System.out.println(lista.calcularValorTotal());
    }
}
