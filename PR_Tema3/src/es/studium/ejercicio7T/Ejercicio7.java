package es.studium.ejercicio7T;

import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		final int MAX = 10; // Realizar un programa que lea 10 números y calcule
		int tabla[] = new int[MAX];
		int minimo, maximo;
		int suma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		// la media, el máximo y el mínimo de los números introducidos.

		for (int i = 0; i < MAX; i++)
		{
			System.out.println("Dame un número");
			tabla[i] = teclado.nextInt();

		}
		teclado.close();
		minimo = tabla[0];
		for (int i = 0; i < MAX; i++)
		{

			if (tabla[i] < minimo)
			{
				minimo = tabla[i];
			}
		}
		System.out.println("El número minimo es " + minimo);
		maximo = tabla[9];
		for (int i = 0; i < MAX; i++)
		{
			if (tabla[i] > maximo)
			{
				maximo = tabla[i];
			}
		}
		System.out.println("El número maximo es " + maximo);
		for (int i = 0; i < MAX; i++)
		{
			suma = suma + tabla[i];
		}
		media = (float) suma / (float) MAX;
		System.out.println("La media es " + media);
	}
}