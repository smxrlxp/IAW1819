package es.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {

	// Pida un n�mero al usuario e indique cu�ntos n�meros primos hay entre 1 y el n�mero
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("N�: ");
		int numero = sc.nextInt();
		int contador;
		
		for (int i = 2; i < numero; i++) {
			contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.println(i);
			}
		}
	}
}