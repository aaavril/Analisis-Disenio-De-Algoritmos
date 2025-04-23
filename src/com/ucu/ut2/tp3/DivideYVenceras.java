package com.ucu.ut2.tp3;

import com.ucu.ut2.tp2.FuncionesRecursivas;

public class DivideYVenceras 
{
	//Ejercicio 1 – Invertir una cadena
	//Dada una cadena de caracteres, escribir un método recursivo que la imprima en orden inverso. Por ejemplo, si se recibe la cadena "hola", debe imprimirse "aloh".
	//Implementar este algoritmo utilizando el enfoque de divide y vencerás.
	
	public String cadenaInversa(String s)
	{
		if (s.length()==1) 
	{
			return s;
	}
		return cadenaInversa(s.substring(s.length()/2)) + cadenaInversa(s.substring(0, s.length()/2));
	}
	
	//Ejercicio 2 – Suma de dígitos binarios
	//Dado un número binario representado como una cadena (por ejemplo, "1101"), escribir un método recursivo que calcule la suma de sus dígitos. Por ejemplo, "1011" debe devolver 3. Implementar el algoritmo dividiendo la cadena en dos mitades en cada llamada recursiva.
	
	public int sumaDigitosBinarios (String n)
	{
		if (n == null || n.isEmpty()) 
		{
				return 0;
		}
		
		 if (n.length() == 1) 
		 {
		        int ultimoDigito = Character.getNumericValue(n.charAt(0));
		        return ultimoDigito;
		 }

		return sumaDigitosBinarios(n.substring(n.length()/2)) + sumaDigitosBinarios(n.substring(0, n.length()/2));
 
		
	}

	
	public static void main(String[] args) 
	{
        DivideYVenceras divide = new DivideYVenceras();

        // 1. cadena inversa 
        System.out.println("Cadena Inversa de Hola: " + divide.cadenaInversa("Hola"));  // Debería imprimir true
        System.out.println("Cadena Inversa de Avril: " + divide.cadenaInversa("Avril"));  // Debería imprimir false
        
        // 2. dígitos binarios
        System.out.println("Suma dígitos 1011: "+ divide.sumaDigitosBinarios("1011"));
        System.out.println("Suma dígitos 1: "+ divide.sumaDigitosBinarios("1"));
        System.out.println("Suma dígitos 001: "+ divide.sumaDigitosBinarios("001"));

        	}	


}
