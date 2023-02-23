package es.studium.ejercicio10T;

public class Ejercicio10
{

	public static void main(String[] args)
	{

		final int FILAS = 10;
		final int COLUMNAS = 10;
		int tabla[][] = new int[FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++)
		{
			for (int j = 0; j < COLUMNAS; j++)
			{

				tabla[i][j] = i + j;
			}
		}
		for (int i = 0; i < FILAS; i++)
		{
			for (int j = 0; j < COLUMNAS; j++)
			{
				System.out.print("\t " + tabla[i][j]);
			}
			System.out.println("");
		}

	}

}
