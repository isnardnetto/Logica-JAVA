package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

	//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		
		int media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println(media);
		
	}
