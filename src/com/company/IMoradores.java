package com.company;

public abstract class IMoradores {
    private String nome;
    private String senha;

    public abstract void logar(String nome,String senha);

    public abstract boolean isLogado();

}
