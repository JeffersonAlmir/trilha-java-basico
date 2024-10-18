package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;
    

    public Mentoria(String titulo, String descricao ) {
        super(titulo, descricao);
        this.data =LocalDate.now();
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * 20;
    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", Titulo=" + getTitulo() + ", Descricao=" + getDescricao() + "]";
    }

    

    
}
