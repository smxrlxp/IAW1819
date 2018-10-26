package es.cj.datos;

import java.util.Scanner;

public class Ejercicio04 {
	
	// Escribir un programa que lea un n�mero desde el teclado y realice la suma de los 100 n�meros 
	// siguientes, mostrando el resultado en pantalla
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("N�: ");
		int numero = sc.nextInt();
		int suma = 0;
		
		for (int i = (numero + 1); i < (numero + 101); i++) {
			suma = suma + i;
		}
		
		System.out.println(suma);
		
		sc.close();
	}

}