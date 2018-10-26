package es.cj.datos;

import java.util.Scanner;

public class Ejercicio03 {
	
	// Programa que muestre y calcule el producto de los n primeros números impares
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i = 0;
		int numero;
		int contador = 0;
		int productoImpar = 1;
		
		System.out.println("Nº: ");
		numero = sc.nextInt();
		
		do {
			i = i + 1;
			if (i % 2 == 1){
				contador = contador + 1;
				productoImpar = productoImpar * i;
			}
			
		} while (numero != contador);
		
		System.out.println("Producto impares: " + productoImpar);
		
		sc.close();
	}

}