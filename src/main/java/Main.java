import com.danlibs.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Collections em Java", "Curso sobre Collections", 6);
        Conteudo curso2 = new Curso("Generics", "Curso sobre Generics", 2);
        Conteudo mentoria1 = new Mentoria("Utilizando Git", "Mentoria sobre Git", LocalDate.now());
        Conteudo projeto1 = new Projeto("Repositório GitHub", "Criar um repositório no GitHub", "BASICO");
        Conteudo projeto2 = new Projeto("App original", "Criar um app original", "AVANCADO");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(projeto1);
        bootcamp.getConteudos().add(projeto2);


        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Ângela");
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("------------- Alunos do Bootcamp -------------\n");

        System.out.println("================================================");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Ângela - Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Ângela - Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("Ângela - Projetos realizados: " + dev2.getProjetosRealizados());
        System.out.println("Ângela - XP: " + dev2.calcularTotalXP());

        System.out.println("\n================================================");
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("João - Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("João - Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("João - Projetos realizados: " + dev1.getProjetosRealizados());
        System.out.println("João - XP: " + dev1.calcularTotalXP());

        System.out.println("\n================================================");
        System.out.println("Ranking dos devs:");
        Ranking ranking = new Ranking();
        ranking.verRanking(bootcamp.getDevsInscritos());

    }
}
