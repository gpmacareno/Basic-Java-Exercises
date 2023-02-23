package es.studium.ejercicio3C;

import java.util.Scanner;

public class Ejercicio3
{

	public static void main(String[] args)
	{
	
		Scanner teclado = new Scanner(System.in);
		String cadena1;
		String cadena2;
		System.out.println("Dame la primera cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Dame la segunda cadena:");
		cadena2 = teclado.nextLine();
		teclado.close();
		if (cadena1.length() == cadena2.length())
		{
			System.out.println("Son iguales longitudinalmente");
		}else if(cadena1.length() < cadena2.length())
		{
		     System.out.println("La primera cadena es menor a la segunda cadena ");
		}
		else {
			System.out.println("La primera cadena es mayor a la segunda");
		}
		
	}	
	

}


