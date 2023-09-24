package org.example.domain;

public enum Investimentos {
    RENDA_FIXA(2.5) {
        Double calculaValorRetornadoMes(Double valor) {
            return valor * RENDA_FIXA.porcentagem;
        }
    },
    TESOURO_DIRETO(5.0) {
        Double calculaValorRetornadoMes(Double valor) {
            return valor * TESOURO_DIRETO.porcentagem;
        }
    },
    FUNDO_IMOBILIARIO(7.5) {
        Double calculaValorRetornadoMes(Double valor) {
            return valor * FUNDO_IMOBILIARIO.porcentagem;
        }
    };

    private Double porcentagem;

    Investimentos(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    abstract Double calculaValorRetornadoMes(Double valor);
}
