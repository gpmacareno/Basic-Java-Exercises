package es.studium.ejercicio2T;

public class Ejercicio2
{

	public static void main(String[] args)
	{

		final int MAX = 20;
		int tablaEnteros[] = new int[MAX];
		for (int i = 0; i < MAX; i++)
		{
			tablaEnteros[i] = i * 2;

		}

		for (int numero : tablaEnteros)
		{

			System.out.println("Los 20 primeros numeros pares son: " + numero);
		}

	}

}
