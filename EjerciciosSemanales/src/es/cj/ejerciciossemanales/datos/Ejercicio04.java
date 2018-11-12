package es.cj.ejerciciossemanales.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
	
	// (26/10/18) Rellena una tabla de 20 números positivos de manera aleatoria. 
	// Pida números al usuario (0 para finalizar el bucle) y muestra cuántas veces 
	// se repite el número en la tabla y cuál es la primera posición en la que aparece
	// (-1 si no se encuentra en la tabla)
	
	private static Scanner sc = new Scanner(System.in);
	private static int [] tabla;
	private static int numeros;
	private static int contRepeticiones;
	private static int contPosicion = 0;
	
	public static void main(String[] args) {
		
		tabla = new int [20];
		
		iniciar();
		
		System.out.println(Arrays.toString(tabla));
		
		do {
			System.out.print("Nº: (valor = 0 para finalizar el bucle)");
			numeros = sc.nextInt();
			RepyPos();
			mostrar();
		} while (numeros != 0);	
		
		
		
	}
	
	private static void RepyPos() {
		// TODO Auto-generated method stub
		contRepeticiones=0;
		contPosicion = -1;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == numeros) {
				contRepeticiones++;
				if (contPosicion == -1) {
					contPosicion = i;
				}
			}
		}
	}
	
	private static void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(contRepeticiones);
		System.out.println(contPosicion);
	}

	private static void iniciar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10) + 1;
		}
	}


}
