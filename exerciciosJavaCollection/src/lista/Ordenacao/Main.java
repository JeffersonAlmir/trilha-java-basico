package lista.Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("joão", 29, 1.79);
        ordenacaoPessoa.adicionarPessoa("Pedro", 28, 1.62);
        ordenacaoPessoa.adicionarPessoa("maria", 58, 1.98);
        ordenacaoPessoa.adicionarPessoa("camillo", 22, 1.60);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.OrdenarPorIdadeReverso());
        System.out.println(ordenacaoPessoa.OrdenarPorIdade());


    }
}
