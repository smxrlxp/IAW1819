package es.cj.ejerciciossemanales.datos;

import java.util.Scanner;

public class Ejercicio01 {
	
	private static Scanner sc = new Scanner(System.in);
	
	// Se solicita leer un n�mero entero positivo y determinar si es un n�mero de 1,2,3 o 4 cifras.
	
	public static void main(String[] args) {
		
		System.out.println("N�mero entero positivo:");
		int num = sc.nextInt();
		
		if (num > 0) { 
			if (num / 10 == 0) 
				System.out.println("El n�mero " + num + " tiene 1 cifra.");
			else if (num / 100 == 0)
				System.out.println("El n�mero " + num + " tiene 2 cifras.");
			else if (num / 1000 == 0) 
				System.out.println("El n�mero " + num + " tiene 3 cifras.");
			else if (num / 10000 == 0)
				System.out.println("El n�mero " + num + " tiene 4 cifras.");
			else
				System.out.println("El n�mero " + num + " tiene m�s de 4 cifras.");
		}
		else
			System.out.println("El n�mero " + num + " es negativo o cero.");
	}

}
