import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("curso js","curso de js", 4);
        Curso curso2 = new Curso("curso java","curso de java", 10);

        Mentoria mentoria1 = new Mentoria("mentoria de java", "descrição da mentoria java");

        Bootcamp bootcamp1 = new Bootcamp("Bootcamp java Dev", "descrição bootcamp java deve");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        

        Dev devJunior = new Dev("Junior");
        devJunior.InscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Junior: " + devJunior.getConteudoInscrito()+"\n");
        devJunior.progredir();
        System.out.println("Conteúdos Concluídos Junior: " + devJunior.getConteudoConcluidos() + "\n");
        
        System.out.println("---------------------");


        Dev devJoao = new Dev("João");
        devJoao.InscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos João "+ devJoao.getConteudoInscrito()+"\n");
        System.out.println("XP inicial " + devJoao.calcularTotalXp());

        if(devJoao.progredir()){
            System.out.println("Você Progrediu");
            System.out.println("XP " + devJoao.calcularTotalXp());
        }else{
            System.out.println("Você não está matriculado em nenhum conteúdo");
        }
       
        System.out.println("Conteudos inscritos João "+ devJoao.getConteudoInscrito()+"\n");
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudoConcluidos()+"\n");

        if(devJoao.progredir()){
            System.out.println("Você Progrediu");
            System.out.println("XP " + devJoao.calcularTotalXp());
        }else{
            System.out.println("Você não está matriculado em nenhum conteúdo");
        }

        System.out.println("Conteudos inscritos João "+ devJoao.getConteudoInscrito()+"\n");
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudoConcluidos()+"\n");
        
    }
}
