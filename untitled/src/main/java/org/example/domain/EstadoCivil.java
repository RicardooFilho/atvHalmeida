package org.example.domain;

public enum EstadoCivil {
    CASADO("está casado(a)"),
    NOIVO("está noivo(a)"),
    NAMORANDO("está namorando");

    private String descricao;

    EstadoCivil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
