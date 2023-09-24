package org.example.domain;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica (String nome, Conta conta, String cnpj) {
        super(nome, conta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
