/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo06 {

    public static void main(String[] args) {

        int[] valor1 = {100, 1000, 200, 2000, 3000};
        int[] valor2 = {1, 2, 3, 4, 5};
        // Declaramos dos arreglos con sus valores.
        // Encontrar la suma de las posiciones
        // [0][0]
        // [1][1]
        // hasta el final
        
        // Un ciclo for donde obtenemos la suma de dos valores 
        // principales del arreglo1 y arreglo2.
        
        for (int i = 0; i < valor1.length; i++) {
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(valor1[i], valor2[i]));
        }
        // Un ciclo repetitivo for donde declaramos dos variables de tipo 
        // entero apra que reconosca los caracteres principales del arreglo 
        // 01 y arreglo02    y abtenemos la suma de los dos.  
        
            for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(num1, num2));
        }
        // Un ciclo for donde declaramos dos variables enteras para arreglo1 
        // y arreglo2 y una variable suma para obtener la suma de los dos arreglos.
        for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            int suma = obtenerSuma(num1, num2); 
            System.out.printf("El valor es: %d\n", suma);
        }
        
        

    }
    // Una funcion donde si b es igual a cero, 
    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
