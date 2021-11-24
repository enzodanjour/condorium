package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int index = 0;
        Morador morador = new Morador();
        boolean autorizado = false;
        do{
            System.out.println("Bem vindo faça o login no condorium");
            System.out.println("Digite o seu nome");
            String nome = scanner.nextLine();
            System.out.println("Digite a sua senha");
            String senha = scanner.nextLine();
            morador.logar(nome,senha);
            System.out.println(morador.isLogado());
            autorizado = morador.isLogado();
        }while(!autorizado);
        do {
            try {
                System.out.println("Bem vindo ao menu do condorium, o seu sistema de gestão condominial");
                System.out.println("Digite o que deseja\n1-Cadastrar agendamento\n2-Registrar noticia");
                index = scanner.nextInt();
            } catch (Exception e) {

            }
        }while (index != 6);


    }
}
