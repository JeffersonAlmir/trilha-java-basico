package Pesquisa;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.AdicionarLivro("Codigo Limpo","Robert Cecil", 2009);
        catalogo.AdicionarLivro("O Codificador Limpo","Robert Cecil", 2012);
        catalogo.AdicionarLivro("Algoritmo: Teoria e Prática","Thomas Cormen", 2012);
        catalogo.AdicionarLivro("Data Science Para Negócios"," Foster Provost", 2016);
        System.out.println(catalogo.pesquisarPorTitulo("Codigo Limpo"));
        System.out.println(catalogo.pesquisarPorAutor("Robert Cecil"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2010, 2014));
        
        
    }
}
