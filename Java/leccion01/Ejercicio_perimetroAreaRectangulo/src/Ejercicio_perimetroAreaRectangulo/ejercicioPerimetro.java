
package Ejercicio_perimetroAreaRectangulo;

import java.util.Scanner;
public class ejercicioPerimetro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        
        System.out.println("Ingrese la base: ");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        
        double area = base + altura;
        double perimetro = 2 + (base + altura);
        
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        
        entrada.close();
        
        
        
    }
}
