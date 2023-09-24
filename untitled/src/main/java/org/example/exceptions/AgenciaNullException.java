package org.example.exceptions;

public class AgenciaNullException extends Exception{

    public AgenciaNullException() {
        super("Agência não pode ser nula!");
    }
}
