package es.cj.datos;

import java.util.Scanner;

public class Ejercicio09 {

	private static Scanner sc = new Scanner(System.in);

	// Leer por teclado una serie de n n�meros. 
	// La aplicaci�n debe indicarnos si los n�meros est�n ordenados de forma creciente, 
	// decreciente o si no est�n ordenados

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca exit para terminar de ingresar numeros.");
				
		String numeroStr;
		int numero1;
		Integer numero2 = null;
		boolean salida = true;
		boolean creciente = false;
		boolean decreciente = false;
		int contador = 1;
		
		do {
			System.out.println("N� " + contador + " : ");
			numeroStr = sc.next();
			
			if (numeroStr.equalsIgnoreCase("exit")) {
				salida = false;
			}else {
				numero1 = Integer.parseInt(numeroStr);
				contador = contador + 1;
				if(numero2 != null) {
					if (numero1 > numero2) {
						creciente = true;
					}else if(numero1 < numero2) {
						decreciente = true;
					}
					
				}
				numero2 = numero1;
			}
		}while (salida);
	
		if(creciente && decreciente) {
			System.out.println("No ordenados");
		}else if(decreciente && !creciente) {
			System.out.println("Decreciente");
		}else if(creciente && !decreciente) {
			System.out.println("Creciente");
		}
		
	}
}
