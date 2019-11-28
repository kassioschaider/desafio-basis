package br.com.kassioschaider.desafio.basis.web.rest;

import br.com.kassioschaider.desafio.basis.dominio.Empresa;
import br.com.kassioschaider.desafio.basis.dominio.Funcionario;
import br.com.kassioschaider.desafio.basis.servico.EmpresaServico;
import br.com.kassioschaider.desafio.basis.servico.dto.EmpresaDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/empresa")
@AllArgsConstructor
public class EmpresaRecurso {

    @Autowired
    private final EmpresaServico empresaServico;

    @RequestMapping(method = RequestMethod.POST)
    public void cadastrarEmpresa(@RequestBody EmpresaDTO empresaDTO){

        Empresa e = new Empresa(
                empresaDTO.getId(),
                empresaDTO.getCnpj(),
                empresaDTO.getNome(),
                empresaDTO.getEndereco()
        );

        empresaServico.salvar(e);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Empresa> obterTodos() {
        return empresaServico.obterTodos();
    }

    @GetMapping("{id}")
    public Optional<Empresa> obterPorId(@PathVariable Long id) {
        return empresaServico.obterEmpresaPorId(id);
    }
}
