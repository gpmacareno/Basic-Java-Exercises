package es.studium.ejemplo3T;

public class Ejercicio3T
{

	public static void main(String[] args)
	{

		final int MAX = 20;
		int tablaEnteros[] = new int[MAX];
		for (int i = 0; i < MAX; i++)
		{
			tablaEnteros[i] = i * 2;

		}

		for (int i = MAX - 1; i >= 0; i--)
		{

			System.out.println("Los 20 primeros numeros pares son: " + tablaEnteros[i]);
		}

	}

}
