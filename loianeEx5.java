package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		//Faça um Programa que converta metros para centímetros. 
		
		Scanner sc = new Scanner(System.in);
		
		double metros = sc.nextDouble();
		
		
		double cm = metros * 100;
		
		System.out.println(cm);
	}

}