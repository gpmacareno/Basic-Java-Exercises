package es.studium.ordenacion;

import java.util.Scanner; //guarda la posición donde cree que esta el mas pequeño y ahi hace el intercambio. 

public class Seleccion
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		int tabla[] = new int[MAX];
		int i;
		int j;
		int aux;
		int ind_menor;
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < MAX ; i++)
		{
			System.out.println("Dáme un número entero: ");		//se guardará la tabla.
			tabla[i] = teclado.nextInt();
		}
		teclado.close();

		for (i = 0; i < MAX-1 ; i++)
		{

			ind_menor = i; //el numero menor es el de la posicion 0.
			for (j = i + 1; j < MAX; j++) //indice el siguiente de i.
			{
				if (tabla[j] < tabla[ind_menor]) // al encontrar uno menor lo guardara en el j
				{
					ind_menor = j;

				}

			}
			aux = tabla[i];				//En este proceso se realiza el intercambio.
			tabla[i] = tabla[ind_menor];
			tabla[ind_menor] = aux;
		}

		System.out.println("La tabla ordenada queda así: ");
		for (i = 0; i < MAX ; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
