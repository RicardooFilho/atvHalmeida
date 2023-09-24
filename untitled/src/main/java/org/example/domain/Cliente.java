package org.example.domain;

public abstract class Cliente {

    private String nome;

    private Conta conta;

    public Cliente (String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
