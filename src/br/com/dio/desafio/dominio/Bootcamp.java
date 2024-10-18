package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;


public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio;
    private final LocalDate dataFinal;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;
    public Object conteudoConcluidos;

    public Bootcamp(String nome, String descricao) {
        this.devsInscritos = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        this.dataFinal = dataInicio.plusDays(45);
        
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    

}
