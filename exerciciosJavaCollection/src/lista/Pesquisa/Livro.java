package Pesquisa;

public class Livro {
    private String titulo;

    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    @Override
     //subcrição do método toString para formata e imprimir a lista com as tarefas e não os endereços de memória.
    public String toString(){
        return "{" + "Titulo: '" + getTitulo() + '\''+  ", Autor: '" + getAutor() +
         '\''+  ", Ano de Publicação: '" + getAnoPublicacao() + '\''+ '}';
    }
}
