import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setTitulo("Mentoria Java");
        mentoria.setdata(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Glauco Serrano");
        dev.inscreverBootcamp(bootcamp);

        System.out.println(("Conteudos Inscrito: " + dev.getConteudosInscritos()));
        dev.progredir();
        System.out.println(("Conteudos Concluidos: " + dev.getConteudosConcluidos()));
        System.out.println(("XP: " + dev.calcularTotalXP()));
        dev.progredir();
        System.out.println(("Conteudos Concluidos: " + dev.getConteudosConcluidos()));
        System.out.println(("XP: " + dev.calcularTotalXP()));
        System.out.println(("Conteudos Inscrito: " + dev.getConteudosInscritos()));
        // System.out.println((curso));
        // System.out.println((mentoria));
    }
}
