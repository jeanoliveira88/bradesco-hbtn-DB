package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private Long id;
    private String logradouro;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private Integer cep;
}

