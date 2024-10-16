package lista.Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
    public List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa( String nome, int idade, double altura){
        this.pessoaList.add(new Pessoa(nome, idade, altura)) ;
    }

    public List<Pessoa> OrdenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> OrdenarPorIdadeReverso(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(this.pessoaList);
        if (!pessoaList.isEmpty()){
            pessoaPorIdade.sort(Collections.reverseOrder());
            return pessoaPorIdade;
        
        } else{
            throw new RuntimeException ("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}
