package es.studium.ordenacion;

import java.util.Scanner;

public class No_Ordenada // busqueda no ordenada.
{

	public static void main(String[] args)
	{

		final int MAX = 10;
		boolean encontrado;
		int elemento;
		int i;
		int tabla[] = new int[MAX];
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < MAX-1; i++)
		{
			System.out.println("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}

		System.out.println("Dáme el número a buscar: ");

		elemento = teclado.nextInt();

		encontrado = false;
		i = 0;

		while ((!encontrado) && (i < MAX))
		{

			if (tabla[i] == elemento)
			{
				encontrado = true;
			} else
			{
				i++;
			}
		}
		if (encontrado == true)
			System.out.println("El elemento se encontró en la posición " + i);
		else
		{
			System.out.println("El elemento NO se ha encontrado");

		}

	}

}
