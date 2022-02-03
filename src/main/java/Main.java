import com.danlibs.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Collections em Java", "Curso sobre Collections", 6);
        Conteudo curso2 = new Curso("Generics", "Curso sobre Generics", 2);
        Conteudo mentoria1 = new Mentoria("Utilizando Git", "Mentoria sobre Git", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Ângela");
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("------------- Alunos do Bootcamp -------------\n");

        System.out.println("================================================");
        System.out.println("Ângela - Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Ângela - Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("Ângela - XP: " + dev2.calcularTotalXP());

        System.out.println("\n================================================");
        dev1.progredir();
        dev1.progredir();
        System.out.println("João - Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("João - Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("João - XP: " + dev1.calcularTotalXP());


    }
}
