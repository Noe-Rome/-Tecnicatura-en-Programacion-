
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */
 /*
        //Var - inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //para ejecutar Shift + F6 es la tecla para mayuscula
        //Reglas para definir una variable en Java
        
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //ejercicio: caracteres especiales con java
        var nombre = "Noelia";
        System.out.println("Nueva linea: \n"+nombre); //diagonal inversa y letra n
        System.out.println("Tabulador: \t"+nombre);
        System.out.println("\t\t. :MENÚ: .");
        System.out.println("Retroceso: \b\b"+nombre); //caracter de retroceso
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas dobles: \""+nombre+"\"");*/
 /*
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("Usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
         */
 /*
        byte numEnteroByte = (byte)127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);
        
        short numEnteroShort = (short)32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short:"+ Short.MIN_VALUE);
        System.out.println("Valor maximo de Short: "+ Short.MAX_VALUE);
        
        int numEnteroInt = (int)2147483647;
        System.out.println("numEnteroInt = "+ numEnteroInt);
        System.out.println("Valor minimo del int:"+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int:"+ Integer.MAX_VALUE);
        
        long numEnteroLong =9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor maximo del long:"+ Long.MAX_VALUE);
        System.out.println("Valor minimo del long:"+ Long.MIN_VALUE);
         */
 /*
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = "+ numFloat);
        System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("El valor maximo de float:"+ Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = "+ numDouble);
        System.out.println("El valor minimo de double es:"+ Double.MIN_VALUE);
        System.out.println("El valor maximo de double es: "+ Double.MAX_VALUE);
         */
 /*
        //Inferencia de tipos var y tipos primitivos
        var numEntero = 20; //las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = "+ numEntero);
        var numFloat = 10.0F; //automaticamente con el punto se transforma en tipo double
        System.out.println("numFloat = " + numFloat); 
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
         */

        //Tipos primitivos char
        /*
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var varCaracter1 = '\u0024'; //indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; //valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        //Tipos primitivos tipos booleanos
        /*var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool == true) {
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        //algoritmo: es mayor de edad?
        var edad = 20; //loteral tener presente la inferencia de tipos
        var adulto = edad >= 18; //esta es una expresion booleana
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }*/
        //Conversion de tipos primitivos
        //var edad = Integer.parseInt("20");
        //System.out.println("edad = " + (edad + 1));
        //var valorPI = Double.parseDouble("3.1416");
        //System.out.println("valorPI = " + valorPI);
        //pedir un valor 
        // var entrada = new Scanner(System.in);
        //System.out.println("Digite su edad:");
        //edad = Integer.parseInt(entrada.nextLine());
        //System.out.println("edad = " + edad);
        //conversion de tipos primitivos parte 2
        /*
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(7);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter:" );
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
 /*int  num1 = 5, num2= 4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("Solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("Solucion de la multiplicacion  = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("Solucion de la division = " + solucion);
        
        var solucion2 = 3.4D / num2;
        System.out.println("Solucion2 resultado de la division = " + solucion2 );
        
        solucion = num1 % num2; //Guarda el residuo entero de la division
        System.out.println("Solucion = " + solucion ); //5/4
        
        if  (num2 % 2 == 0)
        System.out.println("Es un numero par");
        else
        System.out.println("Es un numero impar"); */
 /*int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //una operacion
        System.out.println("varNum3 = "+ varNum3);
        
        varNum1 += 1; // varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1 );
        
        //-= *= /* %=
        
        varNum2 -= 2;
        System.out.println("varNum1- = " + varNum2);
        
        varNum1 *= 5;
        System.out.println(" varNum1* = " + varNum1);
        
        varNum3 /= 4;
        System.out.println("varNum1/ = " + varNum3);
        
        varNum1 %= 6;
        System.out.println("varNum1% = " + varNum1 );*/
 /*var varA = 7;
        var varB = -varA;
        System.out.println("varA = "+ varA);
        System.out.println("varB = " + varB); //EL RESULTADO SERA NEGATIVO
        
        //OPERADOR DE NEGACION 
        var varC = true; //esta literal por defaut en java es de tipo boolean
        var varD = !varC; //aqui esta inviertiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //OPERADORES UNARIOS DE INCREMENTO: PREINCREMENTO
        var varE = 9; //se va a modificar su valor
        var varF = ++varE; //simbolo antes de la variable
        //PRIMERO SE INCREMENTA LA VARIABLE Y DESPUES SE USA SU VALOR
        System.out.println("varE = " + varE);//se incrementa en la unidad
        System.out.println("varF = " + varF);//va a sumar uno
        
        //POSINCREMENTO (EL SIMBOLO VA DESPUES DE LA VARIABLE)
        var varG = 3;
        var varH = varG++; //primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //OPERADORES UNARIOS DE DECREMENTO: PREDECREMENTO
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //POSTDECREENTO
        var varK = 8;
        var varL = varK--;//primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);//aqui va a decrementar en 1
        System.out.println("varL = " + varL);*/
        //OPERADORES DE IGUALDAD Y RELACIONALES
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;//COMPARA SOLO REFERENCIA DE OBJETOS 
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB); //SI COMPARA EL CONTENIDO DE LAS CADENAS
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum != bNum; //> >= < <= == !=
        System.out.println("gVar = " + gVar);
        
        if(aNum % 2 ==0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
        
        var edad = 30;
        var adulto = 18;
        if(edad>= adulto) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }*/
 /* var valorA = 15;
        var valorMinimo = 0; //rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA > 0 && valorA < 10;
        if (respuesta)
            System.out.println("Esta dentro del rango establecido");
        else
            System.out.println("Esta fuera del rango establecido");
        
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego de su hijo");
        else 
            System.out.println("Papá no puede asistir al juego de su hijo");*/
        //OPERADOR TERNARIO
        /*var resultadoT = (5 > 4) ? "verdadero" : "Falso";
        System.out.println("");
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; //14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3;//18
        System.out.println("solucionAritmetica = " + solucionAritmetica);*/
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
