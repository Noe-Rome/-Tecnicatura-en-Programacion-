
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, suma;
        System.out.println("Ingrese la primera calificacion: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda calificacion: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera calificacion: ");
        nota3 = entrada.nextDouble();
        
        suma = nota1 + nota2 + nota3;
        System.out.println("La suma de las calificaciones es:  = " + suma);
        
        
        
        
    }
    
}
