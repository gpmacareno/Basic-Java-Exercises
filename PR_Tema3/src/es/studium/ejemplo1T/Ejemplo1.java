package es.studium.ejemplo1T;

public class Ejemplo1
{								//primera posicion 0 y el ultimo longitud -1

	public static void main(String[] args)
	{

		/**Empezamos con tablas de enteros
		
		int tablaEnteros[] = new int[6];  Especificamos tipo, como se llama y la cantidad de enteros que tendra la tabla.
		tablaEnteros[0] = -2;			  Esta es la manera usual.
		tablaEnteros[1] = 3;
		tablaEnteros[2] = 5;
		tablaEnteros[3] = 0;
		tablaEnteros[4] = 33;
		tablaEnteros[5] = 100;
		
		int tablaEnteros[] = {-2,3,5,0,33,100}; Otro tipo cuando ya se los valores 
		
		int tablaEnteros[] = {-2,3,5,0,33,100};	Mostramos por syso
		System.out.println(tablaEnteros[0]);	
		System.out.println(tablaEnteros[1]);
		System.out.println(tablaEnteros[2]);
		System.out.println(tablaEnteros[3]);
		System.out.println(tablaEnteros[4]);
		System.out.println(tablaEnteros[5]);
																	**/
		int tablaEnteros[] = {-2,3,5,0,33,100};
		for(int i = 0; i<tablaEnteros.length; i++)
		System.out.println(tablaEnteros[i]);	
				
}
}
