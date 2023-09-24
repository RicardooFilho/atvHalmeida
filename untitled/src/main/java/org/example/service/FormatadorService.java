package org.example.service;

import org.example.exceptions.AgenciaNullException;
import org.example.exceptions.NumeroNullException;
import org.example.exceptions.TamanhoAgenciaException;
import org.example.exceptions.TamanhoNumeroException;

public class FormatadorService {

    public String formataAgenciaConta(String agencia) throws AgenciaNullException, TamanhoAgenciaException{
        if (agencia == null) {
            throw new AgenciaNullException();
        }

        String agenciaFormatada = agencia.replaceAll("-", "");

        if (agenciaFormatada.length() != 3) {
            throw new TamanhoAgenciaException();
        }

        return agenciaFormatada;
    }

    public String formataNumeroConta (String numero) throws NumeroNullException, TamanhoNumeroException {
        if (numero == null) {
            throw new NumeroNullException();
        }

        String numeroFormatado = numero.replaceAll("-", ""); //Regex

        if (numeroFormatado.length() != 6) {
            throw new TamanhoNumeroException();
        }

        return numeroFormatado;
    }
}
