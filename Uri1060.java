package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //identar Alt + Ctrl + I
       double x = sc.nextDouble();
       int cont = 0;

       while(x != 0){
           if(x > 0){
               cont = cont + 1;

               x = sc.nextDouble();
           }
           else{
               x = sc.nextDouble();
           }
       }
        System.out.println(cont + " valores positivos");
    }
}

