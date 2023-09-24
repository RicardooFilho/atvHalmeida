package org.example.domain;

public class ContaConjuntaPessoaFisica extends Corrente{

    private PessoaFisica pessoaFisica01;

    private PessoaFisica pessoaFisica02;

    public ContaConjuntaPessoaFisica(String numero, String agencia, Double saldo, PessoaFisica pessoaFisica01, PessoaFisica pessoaFisica02) {
        super(numero, agencia, saldo);
        this.pessoaFisica01 = pessoaFisica01;
        this.pessoaFisica02 = pessoaFisica02;
    }

    public PessoaFisica getpessoaFisica01() {
        return pessoaFisica01;
    }

    public PessoaFisica getpessoaFisica02() {
        return pessoaFisica02;
    }

    public void setpessoaFisica01(PessoaFisica pessoaFisica01) {
        this.pessoaFisica01 = pessoaFisica01;
    }

    public void setpessoaFisica02(PessoaFisica pessoaFisica02) {
        this.pessoaFisica02 = pessoaFisica02;
    }

    public void constroiContaConjuntaPessoaFisica(PessoaFisica pessoaFisica01, PessoaFisica pessoaFisica02) {
        if (pessoaFisica01.getCpf().equals(pessoaFisica02.getCpf()) || pessoaFisica01.getEstadoCivil() == pessoaFisica02.getEstadoCivil()) {
            ContaConjuntaPessoaFisica contaConjuntaPessoaFisica = new ContaConjuntaPessoaFisica("123-456", "12-3", 0.0, pessoaFisica01, pessoaFisica02);
        }
    }
}