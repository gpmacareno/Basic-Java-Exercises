package es.studium.ejemplo2C;

import java.util.Scanner;

public class Ejemplo2
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		String nombre;
		String primerapellido;
		String segundoapellido;
		String nombrecompleto;
		System.out.println("Dame tu nombre:");
		nombre = teclado.nextLine();
		System.out.println("Dame tu primer apellido:");
		primerapellido = teclado.nextLine();
		System.out.println("Dame tu segundo apellido:");
		segundoapellido = teclado.nextLine();
		teclado.close();
		nombrecompleto = nombre + " " + primerapellido + " " + segundoapellido;
		System.out.println("Tu nombre completo es " + nombrecompleto);

		for (int i = 0; i < nombrecompleto.length(); i++)
		{
			System.out.println(nombrecompleto.charAt(i));
		}

		for (int i = 0; i < nombrecompleto.length(); i += 2)
		{
			System.out.print(nombrecompleto.charAt(i));
			if (i < (nombrecompleto.length()-1))
			{

			}
			System.out.println(nombrecompleto.charAt(i + 1));
		}

	}

}
