
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        double Guillermo;
        double Luis;
        double Juan;
        double Total;
        System.out.println("Ingrese el dinero de Guillermo: ");
        Guillermo = entrada.nextDouble();
        Luis= Guillermo / 2;
        Juan = (Guillermo + Luis) / 2;
        Total = Guillermo + Luis + Juan;
        System.out.println("Luis tiene: $ = " + Luis );
        System.out.println("Juan tiene: $ = " + Juan );
        System.out.println("Entre los dos tienen: $ = " + Total );
        
        
        
        
    }
    
}
