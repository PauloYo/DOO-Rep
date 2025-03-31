package br.ifes.edu.doo.Business;

import lombok.Builder;
import lombok.Setter;
import lombok.Getter;

@Builder
@Getter
@Setter
public class Pessoa {
    private String nome;
    private String endereco;
}
