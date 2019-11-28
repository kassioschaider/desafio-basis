package br.com.kassioschaider.desafio.basis.web.rest;

import br.com.kassioschaider.desafio.basis.dominio.Funcionario;
import br.com.kassioschaider.desafio.basis.servico.FuncionarioServico;
import br.com.kassioschaider.desafio.basis.servico.dto.FuncionarioDTO;
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
@RequestMapping("/funcionario")
@AllArgsConstructor
public class FuncionarioRecurso {

    @Autowired
    private final FuncionarioServico funcionarioServico;

    @RequestMapping(method = RequestMethod.POST)
    public void cadastrarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO){

        Funcionario f = new Funcionario(funcionarioDTO.getId(), funcionarioDTO.getNome(),
                funcionarioDTO.getCpf(),
                funcionarioDTO.getDataDeNascimento(),
                funcionarioDTO.getIdEmpresa());
        funcionarioServico.salvar(f);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Funcionario> obterTodos() {
        return funcionarioServico.obterTodos();
    }

    @GetMapping("{id}")
    public Optional<Funcionario> obterPorId(@PathVariable Long id) {
        return funcionarioServico.obterFuncionarioPorId(id);
    }
}
