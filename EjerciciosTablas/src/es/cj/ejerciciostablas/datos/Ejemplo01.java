package es.cj.ejerciciostablas.datos;

import java.util.Arrays;

public class Ejemplo01 {
	
	public static void main(String[] args) {
		
		int tabla [] = {2,3,6,2,7,9,2};

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("El 0 se encuentra en la posición: " + Arrays.binarySearch(tabla, 0));
			System.out.println("El 3 se encuentra en la posición: " + Arrays.binarySearch(tabla, 3));
			System.out.println("El 6 se encuentra en la posición: " + Arrays.binarySearch(tabla, 6));
		}
		
		
	}

}
