package com.company.domain;

import com.company.domain.Pessoa;

public class Morador extends Pessoa {

    public Morador(String nome, String email, String dataNascimento, String senha, int casa) {
        super(nome, email, dataNascimento, senha, casa);
    }

    public void logar(String name, String senha) {
        setNome(name);
        setSenha(senha);
    }

    public boolean isLogado() {
        if((getNome().equals("anderson") && getSenha().equals("123456")) || (getNome().equals("enzo") && getSenha().equals("123456"))){
            return true;
        }else{
            System.out.println("Morador ou senha não correspondentes, reinsira seus dados");
            return false;
        }
    }




}
