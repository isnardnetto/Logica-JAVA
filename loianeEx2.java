package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int numero = sc.nextInt();
		
		System.out.println("O número informado foi " + numero );

	}

}