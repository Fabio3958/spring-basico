package com.evangelista.projetinhospring.model.entity;

import javax.persistence.*;

@Table(name = "funcionario")
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfuncionario", nullable = false)
    private Integer id;

    @Column(name = "cpf", nullable = false, length = 45)
    private String cpf;

    @Column(name = "rg", nullable = false, length = 45)
    private String rg;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "funcao", nullable = false, length = 45)
    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}