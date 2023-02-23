package es.studium.ejemploTC;

public class TablasyCadenasSPLIT
{

	public static void main(String[] args)
	{

		String texto = "En un lugar de la mancha";
		String tabla[] = texto.split(" ");
		for (String cadena : tabla)
		{
			System.out.println(cadena);
		}
		String fecha = "23/11/2022";
		String tabla2[] = fecha.split("/");
		for (String cadena : tabla2)
		{
			System.out.println(cadena);
		}
	}

}
