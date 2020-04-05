package com.company;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.next();
        String nome2 = sc.next();
        String nome3 = sc.next();


        if(nome1.equals("vertebrado")&& nome2.equals("ave")&&nome3.equals("carnivoro")){

                    System.out.println("aguia");
                }else if (nome1.equals("vertebrado")&& nome2.equals("ave")&&nome3.equals("onivoro")){
                    System.out.println("pomba");
        }

        if(nome1.equals("vertebrado")&& nome2.equals("mamifero")&&nome3.equals("onivoro")){

            System.out.println("homem");
        }else if (nome1.equals("vertebrado")&& nome2.equals("ave")&&nome3.equals("herbivoro")){
            System.out.println("vaca");
        }

        if(nome1.equals("invertebrado")&& nome2.equals("inseto")&&nome3.equals("hematofago")){

            System.out.println("pulga");
        }else if (nome1.equals("invertebrado")&& nome2.equals("inseto")&&nome3.equals("herbivoro")){
            System.out.println("lagarta");
        }

        if(nome1.equals("invertebrado")&& nome2.equals("anelideo")&&nome3.equals("hematofago")){

            System.out.println("sanguessuga");
        }else if (nome1.equals("invertebrado")&& nome2.equals("anelideo")&&nome3.equals("onivoro")){
            System.out.println("minhoca");
        }
    }

}


