package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //identar Alt + Ctrl + I

        double idade = sc.nextDouble();
        int cont = 0;
        double soma = 0;

        while(idade > 0){
            cont = cont + 1;
            soma = soma + idade;
            idade = sc.nextDouble();
        }

        double media = soma / cont;
        System.out.println(media);
    }
}