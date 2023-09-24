package org.example.domain;

import org.example.exceptions.SaldoIgualZeroException;
import org.example.exceptions.SaldoMenorQueCinquentaException;
import org.example.exceptions.SaldoMenorQueValorInformadoException;

public class Poupanca implements Conta{

    private String numero;

    private String agencia;

    private Double saldo;

    public Poupanca(String numero, String agencia, Double saldo) throws SaldoMenorQueCinquentaException {
        if (saldo >= 50.00) {
            this.numero = numero;
            this.agencia = agencia;
            this.saldo = saldo;
        }
        throw new SaldoMenorQueCinquentaException();
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public Double deposito(Double valor) {
        return this.saldo += valor;
    }

    @Override
    public Double pagamento(Double valor, Conta contaDestino) throws SaldoIgualZeroException, SaldoMenorQueValorInformadoException {
        if (valor == 0.0) {
           throw new SaldoIgualZeroException();
        } else if (this.saldo < valor) {
            throw new SaldoMenorQueValorInformadoException();
        }
        this.saldo -= valor;
        return contaDestino.deposito(valor);
    }

    @Override
    public Double saque(Double valor) throws SaldoIgualZeroException, SaldoMenorQueValorInformadoException {
        if (valor == 0.0) {
            throw new SaldoIgualZeroException();
        } else if (this.saldo < valor) {
            throw new SaldoMenorQueValorInformadoException();
        }
        return this.saldo -= valor;
    }

    @Override
    public Double extratoPorPeriodo() {
        return this.saldo;
    }

    @Override
    public Double financiamento(Double valor, Financiamento financiamento) {
        return financiamento.calculaParcelas(valor);
    }

    @Override
    public Double aplicacao(Double valor, Investimentos investimentos) {
        return investimentos.calculaValorRetornadoMes(valor);
    }
}
