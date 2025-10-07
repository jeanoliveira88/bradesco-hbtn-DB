package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso {
    private Long id;
    private String nome;
    private String sigla;
    private Professor professor;
    private MaterialCurso materialCurso;
}

