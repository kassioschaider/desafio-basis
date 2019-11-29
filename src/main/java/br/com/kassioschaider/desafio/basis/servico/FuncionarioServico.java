package br.com.kassioschaider.desafio.basis.servico;

import br.com.kassioschaider.desafio.basis.dominio.Funcionario;

import java.util.Optional;

public interface FuncionarioServico {

    Funcionario salvar(Funcionario f);

    Iterable<Funcionario> obterTodos();

    Optional<Funcionario> obterFuncionarioPorId(Long id);

    void excluirFuncionarioPorId(Long id);

    Funcionario alterarFuncionarioPorId(Long id);
}
