import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		sc.close();
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch ( Exception e) {
		//validar se parametronUm é MAIOR que parametroDois e lançar a exceção
            
            System.out.println( "O segundo parâmetro deve ser maior que o primeiro");
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if( parametroDois < parametroUm){
            throw new ParametrosInvalidosException ();
        } else{	
        	int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for(int i = 0; i < contagem; i++){
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
	}
}