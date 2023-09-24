package org.example.exceptions;

public class SaldoMenorQueValorInformadoException extends Exception{

    public SaldoMenorQueValorInformadoException() {
        super("Não foi possível completar a transação. Seu saldo é menor que o valor informado.");
    }
}
