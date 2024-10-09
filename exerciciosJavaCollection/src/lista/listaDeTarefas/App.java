package listaDeTarefas;
public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa lista1 = new ListaTarefa();

        lista1.adicionarTarefa("arruma a casa");
        lista1.adicionarTarefa("arruma a cama");
        lista1.adicionarTarefa("lavar pratos");
        lista1.adicionarTarefa("varrer a casa");
        System.out.println(lista1.obterNumeroDeTarefas());
        lista1.obterDescricaoDeTarefa();
        lista1.removerTarefa("arruma a cama");
        lista1.obterDescricaoDeTarefa();
        
    
        
    }
}
