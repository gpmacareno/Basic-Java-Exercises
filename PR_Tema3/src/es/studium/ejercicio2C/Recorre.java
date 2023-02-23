package es.studium.ejercicio2C;

public class Recorre
{ // Realizar un programa que, dada una cadena con todo el abecedario de la A a la
	// Z en mayúsculas, la recorra y muestre una a una las letras que la
	// componen

	public static void main(String[] args)
	{

		String alfabeto;
		alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

		for (int i = 0; i < alfabeto.length(); i++)
		{
			System.out.println(alfabeto.charAt(i));
		}

	}

}
