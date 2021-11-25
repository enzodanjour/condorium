package com.company;

public class Morador extends IMoradores {
    private String nome;
    private String senha;

    @Override
    public void logar(String name,String senha) {
        setNome(name);
        setSenha(senha);
    }


    @Override
    public boolean isLogado() {
        if((nome.equals("anderson") && senha.equals("123456")) || (nome.equals("enzo") && senha.equals("123456"))){
            return true;
        }else{
            System.out.println("Morador ou senha não correspondentes, reinsira seus dados");
            return false;
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
