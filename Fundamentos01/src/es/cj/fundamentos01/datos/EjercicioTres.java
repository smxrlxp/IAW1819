package es.cj.fundamentos01.datos;

import java.util.Scanner;

public class EjercicioTres {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("R�dio:");
		double radio = sc.nextDouble();
		double area = Math.PI * (Math.pow(radio, 2));
		double longitud = 2 * Math.PI * radio;
		
		System.out.println("�rea: " + area + " Longitud: " + longitud);
		
		sc.close();
		
	}

}
