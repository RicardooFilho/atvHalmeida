package org.example.domain;

import org.example.exceptions.SaldoMenorQueCinquentaException;

public class ContaConjuntaPessoaJuridica extends Poupanca{

    private PessoaJuridica pessoaJuridica01;

    private PessoaJuridica pessoaJuridica02;

    public ContaConjuntaPessoaJuridica(String numero, String agencia, Double saldo, PessoaJuridica pessoaJuridica01, PessoaJuridica pessoaJuridica02) throws SaldoMenorQueCinquentaException {
        super(numero, agencia, saldo);
        this.pessoaJuridica01 = pessoaJuridica01;
        this.pessoaJuridica02 = pessoaJuridica02;
    }

    public PessoaJuridica getpessoaJuridica01() {
        return pessoaJuridica01;
    }

    public PessoaJuridica getpessoaJuridica02() {
        return pessoaJuridica02;
    }

    public void setpessoaJuridica01(PessoaJuridica pessoaJuridica01) {
        this.pessoaJuridica01 = pessoaJuridica01;
    }

    public void setpessoaJuridica02(PessoaJuridica pessoaJuridica02) {
        this.pessoaJuridica02 = pessoaJuridica02;
    }

    public void constroiContaConjuntaPessoaJuridica(PessoaJuridica pessoaJuridica01, PessoaJuridica pessoaJuridica02) throws SaldoMenorQueCinquentaException {
        if (pessoaJuridica01.getCnpj().equals(pessoaJuridica02.getCnpj())) {
            ContaConjuntaPessoaJuridica contaConjuntaPessoaJuridica = new ContaConjuntaPessoaJuridica("123-456", "12-3", 50.00, pessoaJuridica01, pessoaJuridica02);
        }
    }
}
