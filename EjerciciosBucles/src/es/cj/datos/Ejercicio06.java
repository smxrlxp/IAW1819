package es.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {
	
	// Diseñe una aplicación que muestre las tablas de multiplicar
	// del 1 al 10. Además, solicite al usuario que tabla quiere mostrar
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int multi = 1;
		
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				multi = i * j;
				System.out.println(i + " * " + j + " = " + multi);
			}
		}
		
		System.out.println("Tabla de multiplicar: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(numero + " * " + i + " = " + (numero*i));
		}
		
		sc.close();
		
		}
	}