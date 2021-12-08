package com.company.domain;

public class Eventos {
    private int tipo;
    private String duracao;
    private String local;
    private String decricao;

    public int getTipo() {
        return tipo;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getLocal() {
        return local;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }
}
