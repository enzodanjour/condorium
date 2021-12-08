package com.company.controller;

import java.util.Scanner;

import com.company.domain.Morador;
import com.company.domain.Pessoa;


public class MenuCadastro {

    private String menuCadastro;

    int op;

    Scanner teclado = new Scanner(System.in);

    public String getMenuCadastro() {

        do{

        System.out.println("\n\t --- JÁ É CADASTRADO ---  ");
        System.out.println("\t1 - CADASTRAR NOVO MORADOR");
        System.out.println("\t2 - FAZER LOGIN");
        System.out.print("\tDigite a opção desejada: \n\t");
        op = teclado.nextInt();

        switch(op) {
            case 1:
                Morador M = new Morador();

                System.out.println("\t1 - CADASTRAR NOVO MORADOR");
                System.out.println("Digite o seu nome: ");
                M.setNome(teclado.nextLine());
                teclado.next();

                System.out.println("Digite o seu CPF: ");
                M.setCasa(teclado.nextInt());

                System.out.println("Digite o número da sua casa: ");
                M.setDataNascimento(teclado.nextLine());

                System.out.println("Digite o seu e-mail: ");
                M.setEmail(teclado.nextLine());
                teclado.next();

                System.out.println("Dados do morador: "+"\nnome"+M.getNome()+"\nNúmero da casa"+M.getCasa()+
                        "\nData de nascimento"+M.getDataNascimento()+"\nE-mail"+M.getEmail());
                break;
            case 2:
                System.out.println("\t2 - FAZER LOGIN");
                break;

            default: System.out.println("A opção digitada é inválida, tente novamente!");
            }
        }while(op==1 || op==2);
        return menuCadastro;
    }
}

