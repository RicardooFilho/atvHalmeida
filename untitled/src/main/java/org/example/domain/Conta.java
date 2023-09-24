package org.example.domain;

import org.example.exceptions.SaldoIgualZeroException;
import org.example.exceptions.SaldoMenorQueValorInformadoException;

public interface Conta {

    Double deposito(Double valor);

    Double pagamento(Double valor, Conta contaDestino) throws SaldoIgualZeroException, SaldoMenorQueValorInformadoException;

    Double saque(Double valor) throws SaldoIgualZeroException, SaldoMenorQueValorInformadoException;

    Double extratoPorPeriodo();

    Double financiamento(Double valor, Financiamento financiamento);

    Double aplicacao(Double valor, Investimentos investimentos);


}
