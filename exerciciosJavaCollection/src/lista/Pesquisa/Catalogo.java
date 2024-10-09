package Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class Catalogo {

    private List<Livro> listaLivros;


    public Catalogo(){
        this.listaLivros = new ArrayList<>();
    }

    public void AdicionarLivro(String titulo, String autor, int anoPublicacao){
        this.listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro livro:listaLivros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroNoIntervalo =new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for (Livro livro : listaLivros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <=anoFinal ){
                    livroNoIntervalo.add(livro);
                }
            }
        }
        return livroNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
       Livro livroPorTitulo =null; 
        if(listaLivros.isEmpty()){
            throw new RuntimeException("O catalogo está vazio!");
        }
        for (Livro livro : listaLivros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = livro; 
                break;    
            }              
    }
        if(livroPorTitulo==null){
            throw new RuntimeException("Não existe livro com esse título no catálogo!");
        }
        return livroPorTitulo;
    }

}
