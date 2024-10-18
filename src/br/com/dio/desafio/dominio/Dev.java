package br.com.dio.desafio.dominio;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscrito;
    private Set<Conteudo> conteudoConcluidos;


    public Dev(String nome) {
        this.nome = nome;
        this.conteudoConcluidos = new LinkedHashSet<>();
        this.conteudoInscrito = new LinkedHashSet<>();
    }


    public void InscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public boolean progredir(){

    /* -.stream(): Converte a coleção conteudoInscrito em um Stream, em java o Stream é uma sequencia
    *  de elementos que permite realizar operações funcionais. 
    * -.findFirst(): retorna o primeiro elemento encontrado na lista original. 
    * -Optional: é uma classe em java usada para evitar NullPointerException.Ela pode conter um valor
    * presente ou estar vazia caso não exista nenhum elemento na lista.
    */
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();

        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
            return true;
        } else{
            return false;
        }
    }

    public double calcularTotalXp(){
        return this.conteudoConcluidos.stream()
        .mapToDouble( Conteudo::calcularXp)
        .sum();
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }


    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }


    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }


    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoInscrito == null) ? 0 : conteudoInscrito.hashCode());
        result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoInscrito == null) {
            if (other.conteudoInscrito != null)
                return false;
        } else if (!conteudoInscrito.equals(other.conteudoInscrito))
            return false;
        if (conteudoConcluidos == null) {
            if (other.conteudoConcluidos != null)
                return false;
        } else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
            return false;
        return true;
    }
    

}
