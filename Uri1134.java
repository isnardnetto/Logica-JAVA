package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //identar Alt + Ctrl + I
        
        System.out.println("MUITO OBRIGADO");

        int combustivel = sc.nextInt();
        int contAlcool = 0; // contar quantas vezes eu digitei um número
        int contGaso = 0;
        int contDiesel = 0;

        while(combustivel != 4) {
            if (combustivel == 1) {
                contAlcool = contAlcool + 1;
                combustivel = sc.nextInt();

            }
            else if (combustivel == 2){
                contGaso = contGaso  + 1;
                combustivel = sc.nextInt();
            }
            else if (combustivel == 3) {
                contDiesel = contDiesel + 1;
                combustivel = sc.nextInt();
            }
            else if (combustivel > 4 || combustivel <=0){
                combustivel = sc.nextInt();
            }
        }
        System.out.println(" Álcool : " + contAlcool );
        System.out.println( " Gasolina : " + contGaso );
        System.out.println(" Diesel : " +  contDiesel );
    }
}
