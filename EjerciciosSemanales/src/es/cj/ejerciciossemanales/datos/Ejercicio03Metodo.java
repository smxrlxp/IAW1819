package es.cj.ejerciciossemanales.datos;

import java.util.Scanner;

public class Ejercicio03Metodo {

	public static Scanner sc = new Scanner(System.in);
	
	// Escriba un programa que lea un n�mero entero por el teclado y muestre en la pantalla si es 
	// un n�mero abundante. Un n�mero es abundante si la suma de sus divisores es mayor que �l. 
	// Ejemplo: 12 es abundante ya que sus divisores son 1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.
	
	public static void main(String[] args) {
		
		System.out.println("N�: ");
		int numero = sc.nextInt();
		
		int suma = (int) sumaDivisores(numero);
		
		if(suma > numero)
			System.out.println("Es abundante");
		else
			System.out.println("No es abundante");
		
	}

	private static Object sumaDivisores(int numero) {
		
		int suma = 0;

		for (int i = 1; i < numero; i++) {
			
			if (numero % i==0) {
				suma += i;
			}
		}
		return suma;
	}
}