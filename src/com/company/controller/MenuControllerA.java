package com.company.controller;

import java.util.Scanner;
public class MenuControllerA {

    private String menu;

    int op;

    Scanner teclado = new Scanner(System.in);

    public String getmenu(){
        do {
            System.out.println("\n\t ---  O QUE DESEJA FAZER  ---  ");
            System.out.println("\t1 - ADICIONAR PROTOCOLO");
            System.out.println("\t2 - ADICIONAR ARQUIVO");
            System.out.println("\t3 - ADICIONAR EVENTO");
            System.out.println("\t4 - ");
            System.out.println("\t5 - ");
            System.out.println("\t6 - ");
            System.out.println("\t7 - Sair");
            System.out.print("\tDigite a opção desejada: \n\t");
            op = teclado.nextInt();

            switch(op) {
                case 1:;
                    System.out.println("\nHello World");
                    break;
                case 2:
                    System.out.println("\nHello World");
                    break;
                case 3:
                    System.out.println("\nHello World");
                    break;
                case 4:
                    System.out.println("\nHello World");
                    break;
                case 5:
                    System.out.println("\nHello World");
                    break;
                case 6:
                    System.out.println("\nHello World");
                    break;
                case 7: System.out.println("Fim de Programa!");
                    break;
                default: System.out.println("A opção digitada é inválida, tente novamente!");
            break;
            }
        }while(op!=7);
        return menu;
    }
}

