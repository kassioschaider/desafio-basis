package br.com.kassioschaider.desafio.basis.servico.imp;

import br.com.kassioschaider.desafio.basis.dominio.Funcionario;
import br.com.kassioschaider.desafio.basis.repositorio.FuncionarioRepositorio;
import br.com.kassioschaider.desafio.basis.servico.FuncionarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioServicoImpl implements FuncionarioServico {

    @Autowired
    private FuncionarioRepositorio repositorio;

    @Override
    public Funcionario salvar(Funcionario f) {
        System.out.println(f.toString());

        repositorio.save(f);
        return null;
    }

    @Override
    public Iterable<Funcionario> obterTodos() {
        Iterable<Funcionario> funcionarios = repositorio.findAll();
        return funcionarios;
    }

    @Override
    public Optional<Funcionario> obterFuncionarioPorId(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public void excluirFuncionarioPorId(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public Funcionario alterarFuncionarioPorId(Long id) {
        return null;
    }
}
