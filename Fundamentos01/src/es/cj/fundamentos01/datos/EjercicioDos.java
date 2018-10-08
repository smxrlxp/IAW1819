package es.cj.fundamentos01.datos;

import java.util.Scanner;

public class EjercicioDos {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Alto:");
		int alto = sc.nextInt();
		System.out.println("Ancho:");
		int ancho = sc.nextInt();
		int area = alto * ancho;
		int perimetro = (alto * 2) + (ancho * 2);
		
		System.out.println("Área: " + area + " Perímetro: " + perimetro);
		
		sc.close();
	}
}
