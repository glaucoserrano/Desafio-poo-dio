import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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

        System.out.println((curso));
        System.out.println((mentoria));
    }
}
