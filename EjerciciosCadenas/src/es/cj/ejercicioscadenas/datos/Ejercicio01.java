package es.cj.ejercicioscadenas.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// Muestra el string en May�sculas. Muestra el string en Min�sculas. 
	// Mostrar los 2 primeros caracteres y los 2 �ltimos. 
	// N�mero de veces que aparece el �ltimo car�cter. 
	// Reemplazar todas las veces que se repite el primer car�cter por el primer car�cter en may�scula. 
	// A�adir por el principio y por el final la cadena "***"

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Dame una cadena");
		String cadena = sc.next();
		
		System.out.println("May�sculas : " + cadena.toUpperCase());
		System.out.println("Min�sculas : " + cadena.toLowerCase());
		
		System.out.println("Primeros 2 car�cteres : " + cadena.substring(0, 2));
		System.out.println("�ltimos 2 car�cteres : " + cadena.substring(cadena.length()-2, cadena.length()));
		
		String auxiliar;
		int contador = 0;
		
		auxiliar = cadena.substring(cadena.length()-1);
		
		System.out.println(auxiliar);
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.substring(i,i+1).equals(auxiliar)) {
				contador++;
			}
		}
		
		System.out.println("El �ltimo car�cter aparece : " + contador);
			
		auxiliar = cadena.substring(0, 1);
		
		System.out.println("Reemplazo primer car�cter a masyusculas : " + cadena.replace(auxiliar, auxiliar.toUpperCase() ));
		
		cadena = "***" + cadena;
				
		System.out.println(cadena.concat("***"));
		
	}

}