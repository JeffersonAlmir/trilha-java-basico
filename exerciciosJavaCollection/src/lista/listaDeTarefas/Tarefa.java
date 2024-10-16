package lista.listaDeTarefas;

public class Tarefa{
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    @Override
    // subcrição do método toString para formata e imprimir a lista com as tarefas e não os endereços de memória.
    public String toString(){
        return "Tarefa{" + "descricao: '" + descricao + '\''+'}';
    }
}