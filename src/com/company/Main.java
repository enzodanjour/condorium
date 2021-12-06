package com.company;

import com.company.controller.IMenuController;
import com.company.controller.MenuController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean autorizado = false;
        System.out.println("Bem vindo faça o login no condorium");

        IMenuController menuController = new MenuController();

        menuController.logar();



    }
}
