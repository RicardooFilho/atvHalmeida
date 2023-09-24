package org.example.exceptions;

public class SaldoMenorQueCinquentaException extends Exception{

    public SaldoMenorQueCinquentaException() {
        super("Conta poupança deve inicial com um saldo maior ou igual à R$50,00");
    }
}
