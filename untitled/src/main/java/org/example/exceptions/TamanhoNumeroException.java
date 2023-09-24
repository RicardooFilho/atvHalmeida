package org.example.exceptions;

public class TamanhoNumeroException extends Exception{

    public TamanhoNumeroException(){
        super("Número de conta inválido. Deve conter apenas 6 dígitos");
    }
}
