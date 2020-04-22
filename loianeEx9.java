package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		//Faça um Programa que peça a temperatura em graus Farenheit, 
		//transforme e mostre a temperatura em graus Celsius.
		//C = (5 * (F-32) / 9). 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Qual a temperatura em Farenheit ? ");
		
		double Farenheit = sc.nextDouble();
		
		double Celsius = (5 * (Farenheit-32) / 9);
		
		System.out.println("Em Celsius é : " + Celsius);
		
		
		

	}

}
