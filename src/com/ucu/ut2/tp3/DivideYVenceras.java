package com.ucu.ut2.tp3;

import com.ucu.ut2.tp2.FuncionesRecursivas;

public class DivideYVenceras {
    // Ejercicio 1 – Invertir una cadena
    // Dada una cadena de caracteres, escribir un método recursivo que la imprima en
    // orden inverso. Por ejemplo, si se recibe la cadena "hola", debe imprimirse
    // "aloh".
    // Implementar este algoritmo utilizando el enfoque de divide y vencerás.

    public String cadenaInversa(String s) {
	if (s.length() == 1) {
	    return s;
	}
	return cadenaInversa(s.substring(s.length() / 2)) + cadenaInversa(s.substring(0, s.length() / 2));
    }

    // Ejercicio 2 – Suma de dígitos binarios
    // Dado un número binario representado como una cadena (por ejemplo, "1101"),
    // escribir un método recursivo que calcule la suma de sus dígitos. Por ejemplo,
    // "1011" debe devolver 3. Implementar el algoritmo dividiendo la cadena en dos
    // mitades en cada llamada recursiva.

    public int sumaDigitosBinarios(String n) {
	if (n == null || n.isEmpty()) {
	    return 0;
	}

	if (n.length() == 1) {
	    int ultimoDigito = Character.getNumericValue(n.charAt(0));
	    return ultimoDigito;
	}

	return sumaDigitosBinarios(n.substring(n.length() / 2)) + sumaDigitosBinarios(n.substring(0, n.length() / 2));

    }
    
    //Buscar el máximo en un arreglo
    public int maximo(int[] arr, int inicio, int fin) {
	    if (inicio == fin) {
	        return arr[inicio];
	    }
	    int medio = (inicio + fin) / 2;
	    int maxIzq = maximo(arr, inicio, medio);
	    int maxDer = maximo(arr, medio + 1, fin);
	    return Math.max(maxIzq, maxDer);
	}

    //Contar cuántos elementos hay mayores que un valor dado
    public int contarMayoresQue(int[] arr, int inicio, int fin, int valor) {
	    if (inicio > fin) return 0;
	    if (inicio == fin) return arr[inicio] > valor ? 1 : 0;

	    int medio = (inicio + fin) / 2;
	    int cuentaIzq = contarMayoresQue(arr, inicio, medio, valor);
	    int cuentaDer = contarMayoresQue(arr, medio + 1, fin, valor);
	    return cuentaIzq + cuentaDer;
	}

    //Multiplicación de dos enteros sin usar el operador
    public int multiplicar(int a, int b) {
	    if (b == 0) return 0;
	    if (b == 1) return a;

	    int mitad = multiplicar(a, b / 2);
	    if (b % 2 == 0) {
	        return mitad + mitad;
	    } else {
	        return mitad + mitad + a;
	    }
	}


    public static void main(String[] args) {
	DivideYVenceras divide = new DivideYVenceras();

	// 1. cadena inversa
	System.out.println("Cadena Inversa de Hola: " + divide.cadenaInversa("Hola")); // Debería imprimir true
	System.out.println("Cadena Inversa de Avril: " + divide.cadenaInversa("Avril")); // Debería imprimir false

	// 2. dígitos binarios
	System.out.println("Suma dígitos 1011: " + divide.sumaDigitosBinarios("1011"));
	System.out.println("Suma dígitos 1: " + divide.sumaDigitosBinarios("1"));
	System.out.println("Suma dígitos 001: " + divide.sumaDigitosBinarios("001"));

    }
    
    

}
