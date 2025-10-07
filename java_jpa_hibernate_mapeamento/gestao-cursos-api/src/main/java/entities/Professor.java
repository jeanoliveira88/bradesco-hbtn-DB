package entities;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Professor {
    private Long id;
    private String nomeCompleto;
    private String matricula;
    private String email;
    private List<Curso> cursos;
}

