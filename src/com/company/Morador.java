package com.company;

public class Morador extends IMoradores {
    private String nome ;
    private String senha ;

    @Override
    public void logar(String name,String senha) {
        setNome(name);
        setSenha(senha);
    }


    @Override
    public boolean isLogado() {
        System.out.println(getNome());
        System.out.println(getSenha());
        if(getNome() == "Anderson" && getSenha() == "123456" || getNome() == "enzo" && getSenha() == "123456"){
            return true;
        }else{
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
