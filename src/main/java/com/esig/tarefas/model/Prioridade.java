package com.esig.tarefas.model;

public enum Prioridade {
    BAIXA(0),
    MEDIA(1),
    ALTA(2);

    private final int nivel;

    Prioridade(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

}