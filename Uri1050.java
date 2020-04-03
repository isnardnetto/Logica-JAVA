package com.company;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ddd = sc.nextInt();

        if(ddd == 61){
            System.out.println("brasilia");
        }else if(ddd == 71){
            System.out.println("salvador");
        }else if(ddd == 11){
            System.out.println("sao paulo");
        }else if(ddd == 21){
            System.out.println("rio de janeiro");
        }else if(ddd == 32){
            System.out.println("juiz de fora");
        }else if(ddd == 19){
            System.out.println("campinas");
        }else if(ddd == 27){
            System.out.println("vitoria");
        }else if(ddd == 31){
            System.out.println("belo horizonte");
        }


    }

}
