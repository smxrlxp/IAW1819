package es.cj.ejerciciossemanales.datos;

import java.util.Scanner;

public class Ejercicio02 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Horas:");
		int horas = sc.nextInt();
		int salario;
		int horasextras = horas - 40;
		int horashabiles = horas - horasextras;
	
		if (horas <= 40) {
			salario = horas * 16;
			System.out.println("Salario: " + salario);
		}
		else {
			salario = (horashabiles * 16) + (horasextras * 20);
			System.out.println("Salario: " + salario);
		}
	}

}
