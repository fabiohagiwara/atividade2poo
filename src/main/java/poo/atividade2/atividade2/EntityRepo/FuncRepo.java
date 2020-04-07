package poo.atividade2.atividade2.EntityRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import poo.atividade2.atividade2.Entity.Funcionario;

public interface FuncRepo extends JpaRepository <Funcionario, Integer> {

}