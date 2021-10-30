package com.evangelista.projetinhospring.controller;


import com.evangelista.projetinhospring.model.entity.Funcionario;
import com.evangelista.projetinhospring.model.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    // criar um endpoint pra gravar no banco
    @PostMapping("/funcionarios")
    public boolean gravarAluno(@RequestBody Funcionario funcionario){

        Funcionario gravado = repository.save(funcionario);
        if(gravado == null){

            //nao gravou
            return false;

        }
        else{

            // gravou no banco com sucesso
            return true;

        }
    }

    // endpoint para ler do banco

    @GetMapping("/funcionarios")
    public List<Funcionario> listarFuncionarios(){
        return repository.findAll();
    }

}
