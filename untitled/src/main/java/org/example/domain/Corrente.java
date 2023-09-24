package org.example.domain;

import org.example.exceptions.SaldoIgualZeroException;
import org.example.exceptions.SaldoMenorQueValorInformadoException;

import java.util.List;

public class Corrente implements Conta{

    private String numero;

    private String agencia;

    private Double saldo;

    public Corrente(String numero, String agencia, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
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



