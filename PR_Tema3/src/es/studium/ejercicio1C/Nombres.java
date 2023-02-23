package es.studium.ejercicio1C;

import java.util.Scanner;

public class Nombres
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		String nombre;
		String nombre2;
		String nombre3;
		String nombre4;
		String nombre5;
		String nombres;
		String nombress [] = new String [5]; //Para hacer tablas en un futuro

		System.out.println("Dame un nombre");
		nombre = teclado.nextLine();
		System.out.println("Dame un otro nombre");
		nombre2 = teclado.nextLine();
		System.out.println("Dame un tercer nombre");
		nombre3 = teclado.nextLine();
		System.out.println("Dame un cuarto nombre");
		nombre4 = teclado.nextLine();
		System.out.println("Dame un quinto nombre");
		nombre5 = teclado.nextLine();
		teclado.close();
		System.out.println(String.format("Los 5 nombres son %s %s %s %s %s", nombre, nombre2, nombre3, nombre4, nombre5));
		
		nombres = (nombre + " " + nombre2 + " " + nombre3 + " " + nombre4 + " " + nombre5);

		System.out.println("La elección de sus cinco nombres son " + nombre + " " + nombre2 + " " + nombre3 + " "
				+ nombre4 + " " + nombre5);

		System.out.println("La elección de sus cinco nombres son " + nombres);

	}

}
