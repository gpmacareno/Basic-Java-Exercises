package es.studium.ejemplo9C;

import java.util.Scanner;

public class Ejercicio9
{

	public static void main(String[] args)
	{

		int posicion;
		int longitud;
		String cadena;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		System.out.println("Dame la posición");
		posicion = teclado.nextInt();
		System.out.println("Dame la longitud");
		longitud = teclado.nextInt();
		teclado.close();

		if (cadena.length() < (posicion + longitud))
		{
			System.out.println("No es posible");
		} else
		{
			System.out.println(subcadena(cadena, posicion, longitud));

		}

	}

	private static String subcadena(String cadena, int p, int l)
	{
		String subcadena;
		subcadena = cadena.substring(p, p + l);
		return subcadena;
	}

}
