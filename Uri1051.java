package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double valor = sc.nextDouble();

      if(valor <= 2000){
          System.out.println("isento");
      }
      else if(valor >= 2000.01 && valor <= 3000.00){
            double total = (valor - 2000) * 0.08;
          System.out.println(total);
      }
      else if(valor >= 3000.01 && valor <= 4500.00){
          double total = (valor - 3000) * 0.18 + (1000 * 0.08);
          System.out.println(total);
      }
      else if(valor >= 4500.00){
          double total = (valor - 4500)* 0.28 + (1500 * 0.18) + (1000 * 0.08);
          System.out.println(total);

        }

    }
}
