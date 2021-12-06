package com.company.domain;

enum Tipos{
    Ostensivo(1),
    privado(2),
    ;

    Tipos(int i) {
    }
}

public class Arquivos {
    private String data;
    private Tipos tipoArquivo;
    private String dado;

    public Arquivos(String data, Tipos tipoArquivo, String dado) {
        this.data = data;
        this.tipoArquivo = tipoArquivo;
        this.dado = dado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Tipos getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(Tipos tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }
}
