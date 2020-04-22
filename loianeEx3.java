package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		//Faça um Programa que peça dois números e imprima a soma.

		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println(soma);
	}

}