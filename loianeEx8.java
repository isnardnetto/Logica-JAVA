package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		//Faça um Programa que pergunte quanto você ganha por hora e 
		//o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora ? ");
		
		double ganhoPorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mes ? ");
		
		int horasTrabalhadas = sc.nextInt();
		
		double total = ganhoPorHora * horasTrabalhadas;
		
		System.out.println(total);
	}

}
