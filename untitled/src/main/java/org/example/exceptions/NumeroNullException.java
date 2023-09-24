package org.example.exceptions;

public class NumeroNullException extends Exception{

    public NumeroNullException(){
        super("Número da conta não pode ser nulo!");
    }
}
