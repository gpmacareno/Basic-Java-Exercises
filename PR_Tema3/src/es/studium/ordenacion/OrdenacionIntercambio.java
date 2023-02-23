package es.studium.ordenacion;

import java.util.Scanner;

public class OrdenacionIntercambio
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
		{ // no se puede -2
			System.out.println("Dáme un número entero: ");
			tabla[i] = teclado.nextInt();
		}

		for (i = 0; i < MAX ; i++)
		{
			for (j = i + 1; j < MAX; j++)
			{


				if (tabla[i] < tabla[j])
				{
					aux = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = aux;
				}

			}
		}
		System.out.println("La tabla ordenada queda así: ");
		for(i=0;i < MAX -1;i++) {
			System.out.println(tabla[i]);
		}

	}
}