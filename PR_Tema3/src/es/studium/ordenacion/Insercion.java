package es.studium.ordenacion;

import java.util.Scanner;

public class Insercion
{

	public static void main(String[] args)
	{

		final int MAX = 10;
		int tabla[] = new int[MAX];
		int i;
		int j;
		int aux;
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < MAX; i++)
		{
			System.out.println("Dáme un número entero: "); // se guardará la tabla.
			tabla[i] = teclado.nextInt();
		}
		teclado.close();

		for (i = 0; i < MAX; i++)
		{

			j = i;
			aux = tabla[i];
			while ((j > 0 && aux < tabla[j - 1]))
			{
				tabla[j] = tabla[j-1];
				j = j - 1;

			}
			tabla[j] = aux;

		}
		System.out.println("La tabla ordenada queda así: ");
		for (i = 0; i < MAX; i++)
		{
			System.out.println(tabla[i]);
		}
	}
}
