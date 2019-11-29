package br.com.kassioschaider.desafio.basis.servico.imp;

import br.com.kassioschaider.desafio.basis.dominio.Empresa;
import br.com.kassioschaider.desafio.basis.repositorio.EmpresaRepositorio;
import br.com.kassioschaider.desafio.basis.servico.EmpresaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServicoImpl implements EmpresaServico {

    @Autowired
    private EmpresaRepositorio repositorio;

    @Override
    public Empresa salvar(Empresa e) {
        repositorio.save(e);
        return null;
    }

    @Override
    public Iterable<Empresa> obterTodos() {
        Iterable<Empresa> empresas = repositorio.findAll();
        return empresas;
    }

    @Override
    public Optional<Empresa> obterEmpresaPorId(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public void excluirEmpresaPorId(Long id) {
        repositorio.deleteById(id);
    }
}
