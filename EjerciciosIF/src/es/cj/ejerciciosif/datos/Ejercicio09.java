package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio09 {
	
	// Pedir d�a, mes y a�o y mostrar la fecha del d�a siguiente. Suponer que todos los meses son de 30 d�as
	
	private static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
		
		System.out.println("Dia:");
		int dia = sc.nextInt();
		System.out.println("Mes:");
		int mes = sc.nextInt();
		System.out.println("A�o:");
		int anio = sc.nextInt();
		int diasig = dia + 1;
		int messig = mes + 1;
		int aniosig = anio + 1;
		
		if (anio >= 0) {
			if (mes > 0 && mes <= 11) {
				if (dia > 0 && dia <= 29) {
					System.out.println("Fecha siguiente: " + diasig + "/" + mes + "/" + anio);
				}
				else if (dia == 30) {
					dia = 1;
					System.out.println("Fecha siguiente: " + dia + "/" + messig + "/" + anio);
				}
			}
			else if (mes == 12) {
				if (dia > 0 && dia <= 29) {
					System.out.println("Fecha siguiente: " + diasig + "/" + mes + "/" + anio);
				}
				else if (dia == 30) {
					dia = 1;
					mes = 1;
					System.out.println("Fecha siguiente: " + dia + "/" + mes + "/" + aniosig);
				}
			}
		}
		
		sc.close();
	}
	
}
