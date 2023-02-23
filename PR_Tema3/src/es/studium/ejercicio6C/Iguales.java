package es.studium.ejercicio6C;

import java.util.Scanner;

public class Iguales
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		String cadena1;
		String cadena2;
		System.out.println("Dame la primera cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Dame la segunda cadena:");
		cadena2 = teclado.nextLine();
		teclado.close();
		if (cadena1.equals(cadena2))
		{
			System.out.println("Son iguales");
		} else
		{
			System.out.println("Son distintas");

		}

	}

}
//cadena equals es para igualar dos cadenas, siendo mas efectivo de esta manera a la hora de comparar.
//Sacamos con println la secuencia indicada. Mientras que al principio del ejercicio declaramos las variables. 
//