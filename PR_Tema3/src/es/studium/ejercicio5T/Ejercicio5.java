package es.studium.ejercicio5T;

import java.util.Scanner;

public class Ejercicio5
{

	public static void main(String[] args)
	{

		final int MAX = 10;
		int tabla[] = new int[MAX];
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número");
		numero = teclado.nextInt();
		teclado.close();

		for (int i = 0; i < MAX; i++)
		{
			tabla[i] = (numero + 1) * (numero + 1);
			numero++;
		}
		for (int n : tabla)
		{
			System.out.println(n);
		}

	}

}
