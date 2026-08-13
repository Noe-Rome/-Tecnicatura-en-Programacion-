package Ejercicio_MayorDeDosNumeros;

import java.util.Scanner;

public class Ejercicio_MatorDeDosNumeros {
    public static void main(String[] args) {
        
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer numero: ");
            int num1 = Scanner.nextInt();
            
            System.out.println("Ingrese el segundo numero: ");
            int num2 = Scanner.nextInt();
            
            //uso del operador ternario
            int mayor = (num1 > num2) ? num1 : num2;
            
            System.out.println("El numero mayor es:  = " + mayor);
            
            
            
        }
    }
    
}
