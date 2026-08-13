
package ejercicio2clase10;

import java.util.Scanner;

public class Ejercicio2Clase10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el valor de A:");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double b = teclado.nextDouble();
        
        double resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);
        System.out.println("El cuadrado de la suma es: " + resultado);
    }
    
}
