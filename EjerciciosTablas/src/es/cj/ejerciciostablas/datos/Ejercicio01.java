package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Cantidad:");
		int cantidad = sc.nextInt();
		int tabla [] = new int[cantidad];

		
		double sumaPositivos = 0, sumaNegativos = 0;
		int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Nº: ");
			double numero = sc.nextDouble();
			
			if (numero > 0) {
				sumaPositivos = sumaPositivos + numero; // sumaPositivos += numero;
				contadorPositivos++;
			}
			else if (numero < 0) {
				sumaNegativos = sumaNegativos + numero;
				contadorNegativos++;
			}
			else {
				contadorCeros++;
			}
		}
		System.out.println("Media positivos: " + (sumaPositivos/contadorPositivos));
		System.out.println("Media negativos: " + (sumaNegativos/contadorNegativos));
		System.out.println("Ceros: " + (contadorCeros));
		
	}

}
