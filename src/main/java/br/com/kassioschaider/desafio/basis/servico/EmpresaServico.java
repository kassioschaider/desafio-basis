package br.com.kassioschaider.desafio.basis.servico;

import br.com.kassioschaider.desafio.basis.dominio.Empresa;

import java.util.Optional;

public interface EmpresaServico {

    Empresa salvar(Empresa f);

    Iterable<Empresa> obterTodos();

    Optional<Empresa> obterEmpresaPorId(Long id);
}
