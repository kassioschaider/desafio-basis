package br.com.kassioschaider.desafio.basis.repositorio;

import br.com.kassioschaider.desafio.basis.dominio.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> , JpaSpecificationExecutor<Funcionario> {
    Optional<Funcionario> findById(Long id);
}
