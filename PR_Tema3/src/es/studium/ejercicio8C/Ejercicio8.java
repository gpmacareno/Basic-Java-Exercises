package es.studium.ejercicio8C;

import java.util.Scanner;

public class Ejercicio8
{

	public static void main(String[] args)
	{

		String frase;
		String caracter;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una frase ");
		frase = teclado.nextLine();
		System.out.println("Introduzca un caracter de esa frase ");
		caracter = teclado.nextLine();
		teclado.close();
		System.out.println("La posicion del caracter es " + (frase.indexOf(caracter)));

		/* Si quisieramos que mostrara algo en caso de que no encuentre el caractaer
		if ((frase.indexOf(caracter)+1) != -1) {
			System.out.println("Caracter no encontrado");
		}
		*/
	}

}
