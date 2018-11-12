package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner sc = new Scanner(System.in);
	
	// Leer 2 tablas de n n�meros y mezclarla en una tercera tabla de la siguiente forma:
	// 1� de A, 1� de B, 2� de A, 2� de B, 3� de A, 3� de B,...
	
	public static void main(String[] args) {
		
		// Recogida de datos
		
		System.out.print("Cantidad de N� primera Tabla : ");
		int cantidad = sc.nextInt();
		int numeros1 [] = new int [cantidad];
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = sc.nextInt();
		}
		System.out.print("Cantidad de N� segunda Tabla : ");
		int cantidad2 = sc.nextInt();
		int numeros2 [] = new int [cantidad2];
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i] = sc.nextInt();
		}
		
		// Resoluci�n
		
		int maxima = numeros1.length + numeros2.length;
		int nuevaT [] = new int [maxima];
		
		int contN1 = 0;
		int contN2 = 0;
		
		for (int i = 0; i < nuevaT.length; i++) {
			if(i%2==0) {
				nuevaT[i]=numeros1[contN1];
				contN1+=1;
			}else if(i%2==1) {
				nuevaT[i]=numeros2[contN2];
				contN2+=1;
			}
		}
		
		System.out.println(Arrays.toString(nuevaT));
		
	}

}