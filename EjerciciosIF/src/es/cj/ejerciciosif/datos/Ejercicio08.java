package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio08 {
	
	// Pedir al usuario dia, mes y a�o y comprobar que la fecha es correcta, incluidos bisiestos.
	
	private static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
		
		System.out.println("Dia:");
		int dia = sc.nextInt();
		System.out.println("Mes:");
		int mes = sc.nextInt();
		System.out.println("A�o:");
		int anio = sc.nextInt();
		
		if (anio >= 0) {
			boolean bisiesto = anio % 4 == 0 && !(anio % 100 == 0)  || anio % 400 == 0;
			if (mes > 0 && mes <=12) {
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia > 0 && dia <= 31)
						System.out.println("Fecha v�lida: " + dia + "/" + mes + "/" + anio);
					else
						System.out.println("Fecha no v�lida.");
					break;
					
				case 02:
					if (dia > 0 && dia <= 29 && bisiesto)
						System.out.println("Fecha v�lida: " + dia + "/" + mes + "/" + anio);
					else if (dia > 0 && dia <= 28 && !bisiesto)
						System.out.println("Fecha v�lida:" + dia + "/" + mes + "/" + anio);
					else
						System.out.println("Fecha no v�lida.");
					break;
				
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia > 0 && dia <= 30)
						System.out.println("Fecha v�lida: " + dia + "/" + mes + "/" + anio);
					else
						System.out.println("Fecha no v�lida.");
					break;
					
				default:
					System.out.println("Fecha no v�lida.");
					break;
				}
			}
		}
		
		sc.close();
	}
	
}
