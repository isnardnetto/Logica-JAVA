package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //identar Alt + Ctrl + I

        double x = sc.nextDouble();

        if(x >= 0 && x <= 25){
            System.out.println("Intervalo (0,25]");
        }
        else if(x >= 25.01 && x <= 50){
            System.out.println("Intervalo [25,50]");

        }else if(x >= 50.01 && x <= 75){
            System.out.println("Intervalo (50,75]");

        }else if(x >= 75.01 && x <= 100){
            System.out.println("Intervalo (75,100]");

        }else {
            System.out.println("Fora de intervalo");
        }

    }
}