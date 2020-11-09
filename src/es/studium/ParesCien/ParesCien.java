package es.studium.ParesCien;


public class ParesCien
{

	public static void main(String[] args)
	{
		int i;
		for (i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(potencia(i));
			}
		}

	}
	public static int potencia(int i)
	{
		return i*i;
	}
}


/*
Programa ejercicio24

VARIABLES
   ENTERO i
INICIO
	ESCRIBIR "El cuadrado de los primeros 100 números "
	PARA i=1 HASTA i<=100 HACER
		ESCRIBIR "Su cuadrado " + funPot(i)
		LINEANUEVA()
	FINPARA
FIN

FUNCION procPar (ENTERO i) DEVUELVE ENTERO

VARIABLES
	ENTERO r
INICIO
		SI i%2 = 0 ENTONCES	
			r=i*i							
		FINSI
DEVOLVER r
FIN
*/