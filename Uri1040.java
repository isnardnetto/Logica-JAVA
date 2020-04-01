package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double total = (N1*2) + (N2*3) + (N3*4) + (N4*1);
        double media = total/10;

        if(media >= 7){
            System.out.println("Media " + media);
            System.out.println("Aluno aprovado");
        }

        else if( media <= 5){
            System.out.println("Media " + media);
            System.out.println("aluno reprovado");
        }
        else {
            System.out.println("Media " + media);
            System.out.println("aluno em exame");

            double notaDoExame = sc.nextDouble();
            System.out.println("nota do exame " + notaDoExame );

            double notaDeRecuperacao = (notaDoExame + media)/2;

            if(notaDeRecuperacao >= 5){
                System.out.println("Media final " + notaDeRecuperacao);
                System.out.println("aluno aprovado");
            }else
            {
                System.out.println("Media final " + notaDeRecuperacao);
                System.out.println("reprovado");
            }
        }

    }
}
