package es.cj.ejercicioscadenas.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// Realizar un programa que reciba dos cadenas de caracteres y 
	// cuente el número de apariciones de la primera en la segunda
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Cadena 1:");
		String cadena = sc.nextLine();
		System.out.println("Cadena 2:");
		String cadena2 = sc.nextLine();
		
		int contador = 0;
		
		int pos = cadena2.indexOf(cadena);
		
		while (pos!= -1) {
			contador++;
			pos = cadena2.indexOf(cadena, pos+1);
		}
		
		/* for (int i = 0; i <= cadena2.length() - cadena.length(); i++) {
			if(cadena2.substring(i,i+cadena.length()).equals(cadena)) {
				contador++;
			}
		}*/
		
		System.out.println(contador);
		
	}

}