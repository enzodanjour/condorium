package com.company.domain;

import java.text.SimpleDateFormat;

public class Pessoa{
    private String nome;
    private String email;
    private String dataNascimento;
    private String senha;
    private int casa;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, String email, String dataNascimento, String senha, int casa) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.casa = casa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }
}
