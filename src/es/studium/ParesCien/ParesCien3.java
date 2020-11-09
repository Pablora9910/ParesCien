package es.studium.ParesCien;

public class ParesCien3
{

	public static void main(String[] args)
	{
		int i,resultado=0;
		System.out.println("El cuadrado de los primeros 100 números es");
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
PROGRAMA CuadradosPares 
VARIABLES
ENTERO i, resultado
INICIO 
	PARA i = 1 HASTA 100 HACER
		SI i%2 = 0 ENTONCES
			resultado = calcular(i)
			ESCRIBIR resultado
			LINEA NUEVA
		FINSI
	FINPARA
FIN 

FUNCION calcular(ENTERO i) 

DEVUELVE ENTERO 
INICIO 
	DEVOLVER i*i
FIN */