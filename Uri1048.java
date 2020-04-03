package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) { //22:15
        Scanner sc = new Scanner(System.in);


        double salario = sc.nextDouble();

        if(salario <= 400) {

            double novoSalario = (salario * 0.15)+ salario;
            System.out.println("Novo salario = " + novoSalario);
            System.out.println("Reajuste ganho: = " + (novoSalario - salario));
            System.out.println("Em percentual: = 15% " );
        }
        else if (salario >=400.01 && salario <= 800.00){
            double novoSalario = (salario * 0.12)+ salario;
            System.out.println("Novo salario = " + novoSalario);
            System.out.println("Reajuste ganho: = " + (novoSalario - salario));
            System.out.println("Em percentual: = 12% " );

        }
        else if (salario >=800.01 && salario <= 1200.00) {
            double novoSalario = (salario * 0.10) + salario;
            System.out.println("Novo salario = " + novoSalario);
            System.out.println("Reajuste ganho: = " + (novoSalario - salario));
            System.out.println("Em percentual: = 10% " );

        }
        else if (salario >=1200.01 && salario <= 2000) {
            double novoSalario = (salario * 0.07) + salario;
            System.out.println("Novo salario = " + novoSalario);
            System.out.println("Reajuste ganho: = " + (novoSalario - salario));
            System.out.println("Em percentual: = 7% " );

        }
        else if (salario > 2000 ) {
            double novoSalario = (salario * 0.04) + salario;
            System.out.println("Novo salario = " + novoSalario);
            System.out.println("Reajuste ganho: = " + (novoSalario - salario));
            System.out.println("Em percentual: = 4% " );
        }
    }
}



