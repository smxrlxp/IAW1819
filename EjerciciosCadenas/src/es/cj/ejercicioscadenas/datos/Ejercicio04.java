package es.cj.ejercicioscadenas.datos;

public class Ejercicio04 {
	
	// Escriba un método que, dada una cadena de caracteres, de la suma de todos los dígitos
	// que hay en ella. Por ejemplo, si la cadena es abc12de3f4, dará como resultado 10.
	
	public static void main(String[] args) {
		
		String cadena1 = "abc12de3f4";
		int suma = 0;
		char [] ascii = cadena1.toCharArray();
		
		for (int i = 0; i < ascii.length; i++) {
			if (ascii[i] >= 48 && ascii[i] <= 57) {
				suma = suma + Integer.parseInt(String.valueOf(ascii[i]));
			}
		}
		
		System.out.println(suma);
		
		
		
	}
	
}
