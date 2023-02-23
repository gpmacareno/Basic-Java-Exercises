package es.studium.ejercicio6T;

import java.util.Scanner;

public class Ejercicio6
{
//tabla if else while 
	public static void main(String[] args)
	{

		final int MAX = 2;
		int contadores[] = new int[MAX];
		int numero;
		Scanner teclado = new Scanner(System.in);
		do
		{
			System.out.println("Dáme un numero entero: ");
			numero = teclado.nextInt();
			if (numero > 0)
			{
				contadores[0]++;
			} else if (numero < 0)
			{
				contadores[1]++;
			}
		} while (numero != 0);
		System.out.println(("Hay " + contadores[0] + "números positivos"));
		System.out.println("Hay " + contadores[1] + "números negativos");
		teclado.close();

	}

}
