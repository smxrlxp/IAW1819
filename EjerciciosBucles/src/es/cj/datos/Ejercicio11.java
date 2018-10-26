package es.cj.datos;

import java.util.Scanner;

public class Ejercicio11 {

	private static Scanner sc = new Scanner(System.in);

	// Solicite un n�mero y muestre el cuadrado del n�mero. 
	// El cuadrado de un n�mero se obtiene de sumar tantos n�meros impares como indique el n�mero. 
	// El cuadrado de 1 es 1. El cuadrado de 2 es 4, es decir, 1 + 3. 
	// El cuadrado de 3 es 9, es decir, 1 + 3 + 5
	
	public static void main(String[] args) {
		
		System.out.println("N�: ");
		int numero = sc.nextInt();
		int contadorImpar = 0;
		int suma = 0;
		int contador = 0;
		
		while (contadorImpar < numero) {
			
			contador++;
			
			if (contador%2 != 0) {
				contadorImpar++;
				suma = suma + contador;
			}
		}
		
		System.out.println(suma);
	
	}
}