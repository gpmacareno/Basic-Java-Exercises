package es.studium.ejemplo4C;

public class Ejercicio4
{

	public static void main(String[] args)
	{

		int edad = 28;
		String nombre = "Cristina";
		String cadenaFormateada = "Nuestra amiga %s tiene %d años";   //%s String %d Entero

		System.out.println(String.format(cadenaFormateada, nombre, edad));
		int a=5;
		int b=3;
		String cadenaformateada2 = "%d / %s = %.2f"; //%.2f para un decimal de dos decimales
		System.out.println(String.format(cadenaformateada2, a, b, (double)a/(double)b));
	}

}
