package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	private static Scanner sc = new Scanner(System.in);
	private static int[] tabla;
	
	// Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
	// Eliminar el valor de esa posición y desplazar todos los elementos para no dejar el hueco vacío
	
	public static void main(String[] args) {

		System.out.print("Cantidad de elementos de la tabla: ");
		int cantidad = sc.nextInt();
		
		
		inicializarTabla();
		
		
		
		
		
		System.out.println("¿Que posicion vas a eliminar?");
		int eliminado = sc.nextInt();
		
		int auxiliar [] = new int [cantidad-1];
		
		for (int i = 0; i < auxiliar.length; i++) {
			if(i < (eliminado)){
				auxiliar[i]=tabla[i];
			}else if(i>=(eliminado)) {
				auxiliar[i]=tabla[i+1];
			}
		}
		
		System.out.println(Arrays.toString(auxiliar));
		
	}

	private static void inicializarTabla() {
		// TODO Auto-generated method stub
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10) + 1;
		}
	}

}