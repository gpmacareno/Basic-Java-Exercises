package es.studium.ejercicio1T;

import java.util.Scanner;

public class Ejercicio1Tabla
{

	public static void main(String[] args)
	{

		int tablaEnteros[] = new int[4];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Dame el n�mero entero de la posici�n " + i);
			tablaEnteros[i] = teclado.nextInt();
		}
		for (int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Valor de " + i + ": " + tablaEnteros[i]);
		}
		teclado.close();

	}

}
