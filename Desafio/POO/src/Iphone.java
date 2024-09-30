import Recursos.AparelhoTelefonico;
import Recursos.NavegadorInternet;
import Recursos.RepodutorMusical;

public class Iphone implements RepodutorMusical, AparelhoTelefonico, NavegadorInternet {
   

    @Override
    public void exibirPagina(String url) {
        
        System.out.println("A página esta sendo exibida...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada...");
        
    }

    @Override
    public void AtualizarPagina() {
        
        System.out.println("Página atualizada...");
    }

    @Override
    public void ligar(String numero) {
        
        System.out.println("Ligando para o número: "+ numero + "...");
    }

    @Override
    public void atender() {
        
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar(){
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada...");
        
    }

    @Override
    public void selecionarMusica(String Musica) {
        
        System.out.println("Selecionando música...");
    }
}
