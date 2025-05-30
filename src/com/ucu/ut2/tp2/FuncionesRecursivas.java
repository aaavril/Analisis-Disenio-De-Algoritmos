package com.ucu.ut2.tp2;

public class FuncionesRecursivas {
    // 1. Determine recursivamente si un número dado es par o impar, usando sólo la
    // operación resta.

    public Boolean parImpar(int n) {
	if (n == 0) {
	    return true;
	}
	if (n < 0) {
	    return false;
	}
	return parImpar(n - 2);
    }

    public Boolean parImparBooleano(int n) {
	if (n == 0) {
	    return true;
	}
	if (n == 1) {
	    return false;
	}
	return parImparBooleano(n - 2);
    }

    // 2. Construir un algoritmo recursivo que permita determinar si los dígitos de
    // un número dado son todos pares.

    public int digitosPares(int n) {
	if (n == 0) {
	    return 0;
	}
	if (n % 2 == 0) {
	    return digitosPares(n / 10);
	}
	return 1;
    }

    public Boolean digitosParesBooleano(int n) {
	if (n == 0) {
	    return true;
	}
	if (!(n % 2 == 0)) {
	    return false;
	}
	return digitosParesBooleano(n / 10);
    }

    // 3. Suma de los dígitos de un número: Escribe un método recursivo que calcule
    // la suma de los dígitos de un número entero.
    // El método debe aceptar un solo parámetro: el número entero del cual se
    // calculará la suma de los dígitos.
    // Por ejemplo, sumDigits(123) debería devolver 6 (1 + 2 + 3).
    public int sumaDigitos(int n) {
	if (n == 0) {
	    return 0;
	}
	return (n % 10) + sumaDigitos(n / 10);
    }

    // 4. Impresión de una cadena en orden inverso: Escribe un método recursivo que
    // imprima una cadena dada en orden inverso.
    // El método debe aceptar un solo parámetro: la cadena que se imprimirá en orden
    // inverso. Por ejemplo, si la cadena es "Hola",
    // la salida debería ser "aloH".
    public String cadenaInversa(String s) {
	if (s == null || s.isEmpty()) {
	    return "";
	}
	return s.substring(s.length() - 1) + cadenaInversa(s.substring(0, s.length() - 1));
    }

    // 5. Cálculo del factorial de un número: Escribe un método recursivo que
    // calcule el factorial de un número entero.
    // El factorial de un número n se denota como n! y se define como el producto de
    // todos los enteros positivos desde 1 hasta n.
    // Por ejemplo, factorial(5) debería devolver 120 (5!).
    public int factorial(int n) {
	if (n == 1) {
	    return 1;
	}
	return n * factorial(n - 1);
    }

    // 6. Cálculo de la suma de los primeros n números naturales: Escribe un método
    // recursivo que calcule la suma de los
    // números naturales. Por ejemplo, sumaNumeros(5). 15 (1 + 2 + 3 + 4 + 5). }.

    public int sumaNumeros(int n) {
	if (n == 0) {
	    return 0;
	}
	return n + sumaNumeros(n - 1);
    }

    // 7. Impresión de números naturales en orden ascendente: Escribe un método
    // recursivo que imprima todos los números
    // naturales desde 1 hasta n en orden ascendente. Por ejemplo, printNumbers(5)
    // debería imprimir "1 2 3 4 5".
    public static void printNumbers(int n) {
	if (n == 0) {
	    return;
	}
	printNumbers(n - 1);
	System.out.print(n + " ");
    }

    // 8. Cálculo de la suma de los dígitos de un número binario: Escribe un método
    // recursivo que calcule la suma de los
    // dígitos de un número binario. El método debe aceptar un solo parámetro: el
    // número binario como una cadena de dígitos (0 o 1).
    // Por ejemplo, sumBinaryDigits("1011") debería devolver 3 (1 + 0 + 1 + 1).
    public int sumaDigitosBinarios(String n) {
	if (n == null || n.isEmpty()) {
	    return 0;
	}

	int ultimoDigito = Character.  getNumericValue(n.charAt(n.length() - 1));
	return ultimoDigito + sumaDigitosBinarios(n.substring(0, n.length() - 1));

    }

    // 9. Generación de todas las permutaciones de una cadena: Escribe un método
    // recursivo que genere todas las
    // permutaciones de los caracteres de una cadena dada. Por ejemplo, las
    // permutaciones de la cadena
    // "abc" son "abc", "acb", "bac", "bca", "cab" y "cba". El método debe aceptar
    // la cadena original y una cadena parcial
    // (inicialmente vacía) como parámetros.
    public static void permutaciones(String original, String parcial) {
	if (original.isEmpty()) {
	    System.out.println(parcial);
	    return;
	}

	for (int i = 0; i < original.length(); i++) {
	    char c = original.charAt(i);
	    String restante = original.substring(0, i) + original.substring(i + 1);
	    permutaciones(restante, parcial + c);
	}
    }

    // Main para probar todos los métodos
    public static void main(String[] args) {
	FuncionesRecursivas fr = new FuncionesRecursivas();

	// 1. Par o impar
	System.out.println("1. Par o Impar");
	System.out.println("Par o impar de 4: " + fr.parImpar(4)); // Debería imprimir true
	System.out.println("Par o impar de 7: " + fr.parImpar(7)); // Debería imprimir false

	// 2. Verificación de dígitos pares
	System.out.println("\n2. Dígitos pares");
	System.out.println("¿Todos los dígitos de 2468 son pares? " + (fr.digitosParesBooleano(2468) ? "Sí" : "No")); // Sí
	System.out.println("¿Todos los dígitos de 1234 son pares? " + (fr.digitosParesBooleano(1234) ? "Sí" : "No")); // No

	// 3. Suma de dígitos
	System.out.println("\n3. Suma de dígitos");
	System.out.println("Suma de los dígitos de 123: " + fr.sumaDigitos(123)); // Debería imprimir 6 (1+2+3)

	// 4. Impresión de cadena inversa
	System.out.println("\n4. Cadena inversa");
	System.out.println("Cadena inversa de 'Hola': " + fr.cadenaInversa("Hola")); // Debería imprimir "aloH"

	// 5. Cálculo del factorial
	System.out.println("\n5. Factorial");
	System.out.println("Factorial de 5: " + fr.factorial(5)); // Debería imprimir 120 (5!)

	// 6. Suma de los primeros n números naturales
	System.out.println("\n6. Suma de números");
	System.out.println("Suma de los primeros 5 números naturales: " + fr.sumaNumeros(5)); // Debería imprimir 15
											      // (1+2+3+4+5)

	// 7. Impresión de números naturales en orden ascendente
	System.out.println("\n7. Números en orden ascendente");
	System.out.println("Números hasta 5: ");
	printNumbers(5); // Debería imprimir 1 2 3 4 5

	// 8. Suma de los dígitos binarios
	System.out.println("\n8. Suma de dígitos binarios");
	System.out.println("Suma de los dígitos binarios de '1011': " + fr.sumaDigitosBinarios("1011")); // Debería
													 // imprimir 3

	// 9. Generación de permutaciones
	System.out.println("\n9. Permutaciones");
	System.out.println("Permutaciones de 'abc':");
	permutaciones("abc", ""); // Debería imprimir todas las permutaciones de 'abc'
    }

}
