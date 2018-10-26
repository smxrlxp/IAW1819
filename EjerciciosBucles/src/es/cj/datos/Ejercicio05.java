package es.cj.datos;

import java.util.Scanner;

public class Ejercicio05 {
	
	// Pedir un n�mero y calcular su factorial
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("N�: ");
		int numero = sc.nextInt();
		int factorial = 1;
		
		for (int i = 1; i < (numero + 1); i++) {
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
		
		sc.close();
	}

}