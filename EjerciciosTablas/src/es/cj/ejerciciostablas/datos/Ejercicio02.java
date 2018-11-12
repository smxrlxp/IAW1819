package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static Scanner sc = new Scanner(System.in);
	
	// Leer n n�meros ordenados crecientemente. Pedir al usuario un n�mero y buscarlo en la tabla.
	// Se debe mostrar la posici�n en la que se encuentra. Si no est�, indicarlo con un mensaje
	
	public static void main(String[] args) {
		
		System.out.println("Cantidad:");
		int cantidad = sc.nextInt();
		int tabla [] = new int[cantidad];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(cantidad);
		}
		
		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));
		
		System.out.println("N�mero: ");
		int numero = sc.nextInt();
		
		int busqueda = Arrays.binarySearch(tabla, numero);
		
		if (busqueda < 0){
			System.out.println("El n�mero indicado no aparece en el array.");
		} else {
			System.out.println("El " + numero + " se encuentra en la posici�n: " + busqueda);
		}	
			
	}

}