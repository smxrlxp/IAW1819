package es.cj.datos;

import java.util.Scanner;

public class Ejercicio10 {

	// Dados dos n�meros introducidos por teclado, indique si son amigos o no. 
	// Dos n�meros son amigos si la suma de los divisores propios de uno de ellos es igual al otro 
	// (la unidad se considera divisor propio, pero no lo es el mismo n�mero)

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("N� 1: ");
		int numero1 = sc.nextInt();
		int divisor1 = 0;
		System.out.println("N� 2: ");
		int numero2 = sc.nextInt();
		int divisor2 = 0;
		
		for (int i = 1; i < numero1; i++) {
			if(numero1 % i == 0) {
				divisor1 += i;
			}
		}
		
		for (int i = 1; i < numero2; i++) {
			if(numero2 % i == 0) {
				divisor2 += i;
			}
		}
		
		if (divisor1 == numero2 && divisor2 == numero1) {
			System.out.println("Son n�meros amigos.");
		}else
			System.out.println("No son n�meros amigos.");
		
	}
}