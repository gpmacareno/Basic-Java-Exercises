package es.studium.ejercicio5C;

import java.util.Scanner;

public class Ejercicio5
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		
		
	}

}
