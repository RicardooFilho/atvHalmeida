package org.example.domain;

public enum Financiamento {
    IMOVEL(48) {
        Double calculaParcelas(Double valor) {
            return valor / 48;
        }
    },
    AUTOMOVEL(36) {
        Double calculaParcelas(Double valor) {
            return valor / 36;
        }
    },
    ESTUDANTIL(24) {
        Double calculaParcelas(Double valor) {
            return valor / 24;
        }
    };

    private Integer parcelas;

    Financiamento(Integer parcelas) {
        this.parcelas = parcelas;
    }

    abstract Double calculaParcelas (Double valor);
}
