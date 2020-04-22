	package com.loiane.cursojava.exercicios;
	
	import java.util.Scanner;
	
	public class Ex7 {
	
		public static void main(String[] args) {

			//Faça um Programa que calcule a área de um quadrado,
			// em seguida mostre o dobro desta área para o usuário. 
			
			Scanner sc = new Scanner(System.in);
			
			int lado = sc.nextInt();
			
			int areaDoQuadrado = lado * lado;
			
			int dobroDaArea = areaDoQuadrado * 2;
			
			System.out.println("A area do quadrado é : " + areaDoQuadrado);
			
			System.out.println(" E o dobro é : " + dobroDaArea );
	
		}
	
	}
