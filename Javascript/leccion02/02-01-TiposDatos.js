// tipos de datos en javaScrip
/* 
la sintaxis en lo que es comentarios
es muy similar a la de java realmente diriamos
que es identica
*/

var nombre = 'noelia'; //Tipo Str
console.log(nombre);
nombre = 7;
console.log(nombre);
nombre = 12.3;
console.log(nombre);
var numero = 3000; //tipo numerico
console.log(numero); 

var objeto = {
    nombre : 'noelia',
    apellido : 'romero',
    telefono : '123456789'
}

console.log(objeto);

//tipo de dato boolean
var bandera = true;
console.log(bandera);

//tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//tipo de dato clase
class persona{
	constructor(nombre,apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
}
console.log(typeof persona);

//tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

//null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo objet
console.log(typeof y);

//tipo de dato array y empty string
var autos = ['citroen','audi','BMW','ford'];
console.log(autos);
console.log(typeof autos); //preguntamos que tipo de dato es:

var z ='';
console.log(z); //esto se refiere a que es una cadena vacia
console.log(typeof z);







