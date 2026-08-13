
package Ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        final double SUELDO_BASE = 1000;
        int carrosVendidos;
        double valorVentas;
        double comision;
        double sueldoFinal;
        
        System.out.println("Ingrese cantidad de carros vendidos: ");
        carrosVendidos = entrada.nextInt();
        System.out.println("Ingrese el valor total de las ventas: ");
        valorVentas = entrada.nextDouble();
        
        comision = carrosVendidos * 150;
        
        sueldoFinal = SUELDO_BASE + comision + (valorVentas * 0.05);
        
        System.out.println("El sueldo mensual es: $ = " + sueldoFinal);
        
       
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
