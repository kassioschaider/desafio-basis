package br.com.kassioschaider.desafio.basis.web.rest;

import br.com.kassioschaider.desafio.basis.dominio.Empresa;
import br.com.kassioschaider.desafio.basis.servico.EmpresaServico;
import br.com.kassioschaider.desafio.basis.servico.dto.EmpresaDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmpresaRecurso {

    @Autowired
    private final EmpresaServico empresaServico;

    @PostMapping("/empresas")
    public void cadastrarEmpresa(@RequestBody EmpresaDTO empresaDTO){

        Empresa e = new Empresa(
                empresaDTO.getId(),
                empresaDTO.getCnpj(),
                empresaDTO.getNome(),
                empresaDTO.getEndereco()
        );
        empresaServico.salvar(e);
    }

    @PutMapping("/empresas")
    public void alterarFuncionario(@RequestBody EmpresaDTO empresaDTO){

        Empresa e = new Empresa(
                empresaDTO.getId(),
                empresaDTO.getCnpj(),
                empresaDTO.getNome(),
                empresaDTO.getEndereco()
        );
        empresaServico.salvar(e);
    }

    @GetMapping("/empresas")
    public Iterable<Empresa> obterTodos() {
        return empresaServico.obterTodos();
    }

    @GetMapping("{id}")
    public Optional<Empresa> obterPorId(@PathVariable Long id) {
        return empresaServico.obterEmpresaPorId(id);
    }

    @DeleteMapping("/empresas/{id}")
    public void excluirPorId(@PathVariable Long id){
        empresaServico.excluirEmpresaPorId(id);
    }
}
