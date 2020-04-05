package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();

       while (n1 < 0 || n1 > 10){

           System.out.println( n1 + " nota invalida");
           n1 = sc.nextDouble();

            }

        double n2 = sc.nextDouble();
        while (n2 < 0 || n2 > 10) {

            System.out.println( n2 + " nota invalida");
            n2 = sc.nextDouble();
        }

        double media = (n1 + n2)/2;
        System.out.println("media = " + media);

        }
    }