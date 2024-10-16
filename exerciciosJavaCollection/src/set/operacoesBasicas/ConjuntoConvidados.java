package set.operacoesBasicas;
import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void AdicionarConvidado(String nome, int codigo){
        this.convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo){
        Convidado convidadoParaRemover = null;
        for( Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigo ){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibeConvidados(){
        System.out.println(convidadoSet);
    }





    public static void main(String[] args){
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.AdicionarConvidado("Convidado 1", 123);
        conjunto.AdicionarConvidado("Convidado 2", 124);
        conjunto.AdicionarConvidado("Convidado 3", 125);
        conjunto.AdicionarConvidado("Convidado 4", 123);


        conjunto.exibeConvidados();
        System.out.println(conjunto.contarConvidados());
        conjunto.removerConvidadoPorCodigo(124);
        System.out.println(conjunto.contarConvidados());
        

    }
}

