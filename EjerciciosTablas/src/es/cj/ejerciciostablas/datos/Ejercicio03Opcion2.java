package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03Opcion2 {

	private static Scanner sc = new Scanner(System.in);
	private static int [] numeros;
	private static int [] pares;
	private static int [] impares;
	private static int contPares = 0;
	private static int contImpares = 0;
	
	// Leer tabla de n números y guardar en una tabla los pares y en otra tabla los impares
	
	public static void main(String[] args) {
		
		int tamanyo;

		do {
			System.out.print("Cantidad de Nº : ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);	
		
		numeros = new int [tamanyo];
		pares = new int [tamanyo];
		impares = new int [tamanyo];
		
		inicializarValores();
		
		dividirParesImpares();
		
		mostrarResultado();
		
		
		
	}

	private static void inicializarValores() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

	private static void dividirParesImpares() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				pares[contPares] = numeros[i];
				contPares++;
			} else {
				impares[contImpares] = numeros[i];
				contImpares++;
			}
		}
	}

	private static void mostrarResultado() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));
		
		for (int i = 0; i < contPares; i++) {
			System.out.print(pares[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < contImpares; i++) {
			System.out.print(impares[i] + " ");
		}
	}

}