package es.cj.fundamentos01.datos;

import java.util.Scanner;

public class EjercicioCuatro {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Segundos:");
		int segundos2 = sc.nextInt();
		
		int horas = segundos2 / 3600;
		int minutos = (segundos2 % 3600) / 60;
		int segundos = (segundos2 % 60);
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
		
	}

}
