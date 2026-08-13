
package ejercicio3clase10;

import java.util.Scanner;

public class Ejercicio3Clase10 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       double participacion, parcial01, parcial02, examenFinal;
       double notaFinal;
       
        System.out.println("Ingrese la nota de la participacion: ");
        participacion = teclado.nextDouble();
        
        System.out.println("Ingrese la nota del primer parcial: ");
        parcial01 = teclado.nextDouble();
        
        System.out.println("Ingrese la nota del segundo parcial: ");
        parcial02 = teclado.nextDouble();
        
        System.out.println("Ingrese la nota del examen final: ");
        examenFinal = teclado.nextDouble();
        
        notaFinal = (participacion * 0.10)
                  + (parcial01 * 0.25)
                  + (parcial02 * 0.25)
                  + (examenFinal * 0.40);
               
        System.out.println("Lacalificacion final es: " + notaFinal);
                
    }
    
}
