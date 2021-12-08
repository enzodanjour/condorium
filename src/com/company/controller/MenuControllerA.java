package com.company.controller;

import com.company.domain.Eventos;
import com.company.domain.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuControllerA {

    ArrayList<Eventos> eventos = new ArrayList<Eventos>();

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
                    System.out.println("\n\t ---  QUAL ARQUVO DESEJA  ---  ");
                    System.out.println("\t1 - 1ª VIA DO CONDOMNIO");
                    System.out.println("\t2 - 2ª VIA DO CONDOMNIO");
                    System.out.println("\t3 - 2ª VIA DO GÁS");
                    System.out.println("\t4 - ");
                    System.out.println("\t5 - ");
                    break;
                case 3:

                    Eventos E = new Eventos();

                    System.out.println("Digite qual o evento que deseja: 1 - Salao de festa, 2 - Quadra, 3 - Academa.");
                    E.setTipo(teclado.nextInt());

                    System.out.println("Digite a duração: ");
                    E.setDuracao(teclado.nextLine());
                    teclado.next();

                    System.out.println("Digite o local que desejá: ");
                    E.setLocal(teclado.nextLine());
                    teclado.next();

                    System.out.println("Faça uma breve descrição sobre o seu evento: ");
                    E.setDecricao(teclado.nextLine());
                    teclado.next();

                    System.out.println("Dados do Evento: "+"\n\tTipo do evento"+E.getTipo()+"\n\tDuração"+E.getDuracao()+
                            "\n\tLocal"+ E.getLocal()+"\n\tDescrição"+E.getDecricao());

                    do{
                        System.out.println("Deseja alterar (1-sim, 2-não)? ");
                        op = teclado.nextInt();

                        if(op == 1){

                            System.out.println("Digite qual o evento que deseja (: ");
                            E.setTipo(teclado.nextInt());

                            System.out.println("Digite a duração: ");
                            E.setDuracao(teclado.nextLine());
                            teclado.next();

                            System.out.println("Digite o local que desejá: ");
                            E.setLocal(teclado.nextLine());
                            teclado.next();

                            System.out.println("Faça uma breve descrição sobre o seu evento: ");
                            E.setDecricao(teclado.nextLine());
                            teclado.next();

                            System.out.println("Dados do Evento: "+"\n\tTipo do evento"+E.getTipo()+"\n\tDuração"+E.getDuracao()+
                                    "\n\tLocal"+ E.getLocal()+"\n\tDescrição"+E.getDecricao());

                            System.out.println("Deseja alterar (1-sim, 2-não)? ");
                            op = teclado.nextInt();

                            if(op == 2) {
                                eventos.add(E);
                            }
                        }
                        break;
                    }while(op==2);
                case 4:
                    ;
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

