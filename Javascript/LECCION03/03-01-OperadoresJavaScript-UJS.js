//ejercicio para encontrar numeros pares e impares
let parInpar = 4;
if(parInpar % 2 == 0) {
    console.log("Es un numero par");
}
else{
    console.log("Es un numero impar");
}

//Ejercicio: es mayor de edad
let edad = 18, adulto = 18;
if(edad >= adulto ){
    console.log("Usted es una persona adulta");
}
else{
    console.log("Usted es una persona menor de edad")
}

//ejercicio: dentro de un rango
let dentroRango = 5; //aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log("Estas dentro del rango establecido")
}
else{
    console.log("Estas fuera del rango establecido")
}

//ejercicio: si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso){
	console.log("El padre puede asistir al juego")
}
else {
	console.log("El padre no puede asistir al juego de su hijo")
}

//operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2)

//convertir string a number
let miNumero = "21"; //es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //esta es una funcion
console.log(typeof edad2);

//funcion isNaN
if(isNaN(edad2)){ //NO ES UN NUMERO = IS NOT A NUMBER (devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad2 >= 18){
       console.log("Puede votar");
    }
    else{
         console.log("Muy joven para votar");
    }
}

//operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);


