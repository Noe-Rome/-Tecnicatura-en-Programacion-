
package ifelseejercicio_3;

import java.util.Scanner;

public class IfElseEjercicio_3 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      
        System.out.println("Ingrese el primer numero:");
        int numero1 = teclado.nextInt();
        
        System.out.println("Ingrese un segundo numero: ");
        int numero2 = teclado.nextInt();
        
        if(numero1 == numero2){
            System.out.println(numero1 * numero2);
        }
        else if (numero1 > numero2){
            System.out.println(numero1 - numero2);
        }
        else if (numero1 < numero2){
        System.out.println(numero1 + numero2);
        }
        teclado.close();
    }
    
}
