package br.com.kassioschaider.desafio.basis.servico.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {

    private Long id;
    private String nome;
    private String dataDeNascimento;
    private String cpf;
    private Long idEmpresa;
}
