package es.studium.ejemplo2T;

import java.util.Scanner;

public class Ejemplo2
{

	public static void main(String[] args)
	{

		int tablaEnteros[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		 // Pedir los valores al usuario
		for (int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Dame el n�mero entero de la posici�n " + i);
			tablaEnteros[i] = teclado.nextInt(); 
		}
		// Tratamiento de los valores
		
		for (int i = 0; i < tablaEnteros.length; i++)
		{
			tablaEnteros[i] = tablaEnteros [i] * 2;
		}
		
		// Mostrar los valores de la tabla
		for (int i = 0; i < tablaEnteros.length; i++)
		{
			System.out.println("Valor de " + i + ": " + tablaEnteros[i]);
		}
		teclado.close();

	}

}
