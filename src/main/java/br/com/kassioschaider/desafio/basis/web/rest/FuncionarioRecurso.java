package br.com.kassioschaider.desafio.basis.web.rest;

import br.com.kassioschaider.desafio.basis.dominio.Funcionario;
import br.com.kassioschaider.desafio.basis.servico.FuncionarioServico;
import br.com.kassioschaider.desafio.basis.servico.dto.FuncionarioDTO;
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
public class FuncionarioRecurso {

    @Autowired
    private final FuncionarioServico funcionarioServico;

    @PostMapping("/funcionarios")
    public void cadastrarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO){

        System.out.println(funcionarioDTO);

        Funcionario f = new Funcionario(funcionarioDTO.getId(), funcionarioDTO.getNome(),
                funcionarioDTO.getCpf(),
                funcionarioDTO.getDataDeNascimento(),
                funcionarioDTO.getIdEmpresa());
        funcionarioServico.salvar(f);
    }

    @PutMapping("/funcionarios")
    public void alterarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO){

        System.out.println(funcionarioDTO);

        Funcionario f = new Funcionario(funcionarioDTO.getId(), funcionarioDTO.getNome(),
                funcionarioDTO.getCpf(),
                funcionarioDTO.getDataDeNascimento(),
                funcionarioDTO.getIdEmpresa());
        funcionarioServico.salvar(f);
    }

    @GetMapping("/funcionarios")
    public Iterable<Funcionario> obterTodos() {
        return funcionarioServico.obterTodos();
    }

    @GetMapping("/funcionarios/{id}")
    public Optional<Funcionario> obterPorId(@PathVariable Long id) {
        return funcionarioServico.obterFuncionarioPorId(id);
    }

    @DeleteMapping("/funcionarios/{id}")
    public void excluirPorId(@PathVariable Long id){
        funcionarioServico.excluirFuncionarioPorId(id);
    }
}
