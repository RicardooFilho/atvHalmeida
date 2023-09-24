package org.example.exceptions;

public class TamanhoAgenciaException extends Exception{

    public TamanhoAgenciaException() {
        super("Agencia inválida. Deve conter apenas 3 digítos.");
    }
}
