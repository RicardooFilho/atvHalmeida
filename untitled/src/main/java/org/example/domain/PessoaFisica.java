package org.example.domain;

public class PessoaFisica extends Cliente{

    private String cpf;

    private EstadoCivil estadoCivil;


    public PessoaFisica (String nome, Conta conta, String cpf, EstadoCivil estadoCivil) {
        super(nome, conta);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}