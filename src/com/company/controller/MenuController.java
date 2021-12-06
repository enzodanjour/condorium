package com.company.controller;

import com.company.domain.Morador;
import com.company.domain.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController implements IMenuController{
    Scanner scanner = new Scanner(System.in);
    boolean autorizado = false;

    Morador morador = new Morador("enzo","enzo.danjour@gmail.com","27/05/1999","123456",89);


    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    @Override
    public Morador logar() {
        pessoas.add(morador);
        do{
            System.out.println("Digite o seu nome");
            String nome = scanner.next();
            System.out.println("Digite a sua senha");
            String senha = scanner.next();
            morador.logar(nome,senha);
            System.out.println(morador.isLogado());
            autorizado = morador.isLogado();
        }while(!autorizado);
        return morador;
    }




    public ArrayList<Pessoa> getUsuarios(){
        return pessoas;
    };
}
