package es.cj.ejerciciossemanales.datos;

import java.util.Scanner;

public class Ejercicio03 {

	// Escriba un programa que lea un n�mero entero por el teclado y muestre en la pantalla si es 
	// un n�mero abundante. Un n�mero es abundante si la suma de sus divisores es mayor que �l. 
	// Ejemplo: 12 es abundante ya que sus divisores son 1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("N�: ");
		int numero = sc.nextInt();
		int sumadivisores = 0;

		for (int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				sumadivisores += i;
			}
		}
		
		if (sumadivisores > numero) {
			System.out.println("Es un n�mero abundante.");
		} else
			System.out.println("No es un n�mero abundante.");
	}
}