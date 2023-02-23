package es.studium.ejercicio7C;

import java.util.Scanner;

public class Ejercicio7
{

	/**
	 * Longitud - Realizar un programa que lea una frase por teclado e indique
	 * mediante una función, la longitud de la misma, incluidos los espacios y sin
	 * incluir
	 **/

	public static void main(String[] args)
	{

		String frase;
		int r;
		int r1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una frase ");
		frase = teclado.nextLine();
		teclado.close();
		r = longitud(frase);
		r1 = longitud2(frase);
		System.out.println("El numero de caracteres es" + " " + r);
		System.out.println("El numero de caracteres sin espacios es" + " " + r1);
		
	}

	private static int longitud2(String frase2)
	{
		int contadorEspacios=0;
		for(int i=0;i<frase2.length();i++){
			if(frase2.charAt(i)==' ') {
				contadorEspacios++;
			}
		}
		return (frase2.length()-contadorEspacios);
	}

	private static int longitud(String frase)
	{
		int r;

		r = frase.length();

		return r;

	}

}