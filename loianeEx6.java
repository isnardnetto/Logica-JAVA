package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14;
		
		double Area =  pi * (raio * raio);
		
		System.out.println(Area);

	}

}
