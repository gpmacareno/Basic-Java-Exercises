package es.studium.ejercicio4C;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1;
		String cadena2;
		String cadenas;
		System.out.println("Dame la primera cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Dame la segunda cadena:");
		cadena2 = teclado.nextLine();
		teclado.close();
		cadenas= cadena1+ " " +cadena2;
		
		System.out.println("La suma de sus cadenas es " + cadenas);
	}

}
