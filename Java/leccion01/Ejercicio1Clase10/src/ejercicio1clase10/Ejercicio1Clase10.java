
package ejercicio1clase10;

import java.util.Scanner;


public class Ejercicio1Clase10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el total de horas: ");
        int horasTotales = teclado.nextInt();
        
        int semanas = horasTotales / 168; //1 semana = 168 horas
        int resto = horasTotales % 168;
        int dias = resto / 24;
        int horas = resto % 24;
        
        System.out.println("Semanas: " + semanas );
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        
    }
    
}
