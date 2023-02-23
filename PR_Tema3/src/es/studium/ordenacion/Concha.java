package es.studium.ordenacion;

import java.util.Scanner;

public class Concha
{

	public static void main(String[] args)
	{

		final int MAX = 10;
		int tabla[] = new int[MAX];
		int salto;
		int i;
		boolean cambios;
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < MAX; i++)
		{
			System.out.println("Dáme un número entero: "); // se guardará la tabla.
			tabla[i] = teclado.nextInt();
		}
		teclado.close();

		for (salto = MAX / 2; salto != 0; salto = salto / 2)
		{
			cambios = true;
			while (cambios = true)
			{
				cambios = false;
				
			}
		}
	}

}
