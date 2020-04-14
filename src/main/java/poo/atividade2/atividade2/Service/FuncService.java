package poo.atividade2.atividade2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import poo.atividade2.atividade2.Entity.Funcionario;
import poo.atividade2.atividade2.EntityRepo.FuncRepo;

@Service
public class FuncService {

    @Autowired
    private FuncRepo repo;

    public List<Funcionario> getAllFunc()
    {
        return repo.findAll();
    }

    public void saveFunc(Funcionario func)
    {
        repo.save(func);
    }
}