package Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("jefferson", 29, 1.79);
        ordenacaoPessoa.adicionarPessoa("edylane", 28, 1.62);
        ordenacaoPessoa.adicionarPessoa("maria", 58, 1.49);
        ordenacaoPessoa.adicionarPessoa("jamilly", 22, 1.60);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.OrdenarPorIdadeReverso());
        System.out.println(ordenacaoPessoa.OrdenarPorIdade());


    }
}
