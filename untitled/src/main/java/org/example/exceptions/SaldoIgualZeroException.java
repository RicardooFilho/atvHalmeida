package org.example.exceptions;

public class SaldoIgualZeroException extends Exception{

    public SaldoIgualZeroException() {
        super("Não foi possível completar a transação. Seu saldo é de R$0.00");
    }
}
