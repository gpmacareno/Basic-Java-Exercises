package es.studium.ejercicio8T;

import java.util.Scanner;

public class Ejercicio8T
{

	public static void main(String[] args)
	{

		final int MAX = 10;
		int tabla[] = new int[MAX];
		int maximo;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < MAX; i++)
		{
			System.out.println("Dame un número");
			tabla[i] = teclado.nextInt();

		}
		teclado.close();

		maximo = tabla[0];

		for (int i = 0; i < MAX; i++)
		{
			if (tabla[i] > maximo)
			{
				maximo = tabla[i];
			}
		}
		System.out.println("El número maximo es " + maximo);
		System.out.println("Y se encuentra en las posiciones siguientes: ");
		for (int i = 0; i < MAX; i++)
		{
			if (tabla[i] == maximo)
			{
				System.out.println(i);
			}
		}
	}

}
