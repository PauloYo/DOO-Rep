package br.ifes.edu.doo;

import br.ifes.edu.doo.Business.Pessoa;

public class Application {
    public static void main(String[] args) {
        // Criação de um objeto do tipo Pessoa
        Pessoa pessoa = Pessoa.builder()
            .nome("João")
            .endereco("Rua 1, nº 1")
            .build();

        // Impressão dos dados da pessoa
        System.out.println(pessoa);
    }    
}
