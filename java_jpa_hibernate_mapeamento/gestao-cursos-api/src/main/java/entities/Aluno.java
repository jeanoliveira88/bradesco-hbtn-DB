package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private Long id;
    private String nomeCompleto;
    private String matricula;
    private Date nascimento;
    private String email;
    private List<Telefone> telefones;
    private List<Endereco> enderecos;
    private List<Curso> cursos;
}

