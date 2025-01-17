package com.esig.tarefas.model;

public enum Situacao {
    EM_ANDAMENTO(0, "Em andamento"),
    CONCLUIDA(1, "Concluída");

    private final int nivel;
    private final String descricao;

    Situacao(int nivel, String descricao) {
        this.nivel = nivel;
        this.descricao = descricao;
    }

    public int getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public static int fromDescricao(String descricao) {
        for (Situacao situacao : Situacao.values()) {
            if (situacao.getDescricao().equalsIgnoreCase(descricao)) {
                return situacao.getNivel();
            }
        }
        throw new IllegalArgumentException("Descrição não encontrada: " + descricao);
    }
}