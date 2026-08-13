
#ejercicio 1:
#deberemos plasmar la expresion en una expresion
#algoritmica, osea hacerlo en codigo
'''
a = float(input('Digite el valor de a: '))
b = float(input('Digite el valor de b: '))
c = float(input('Digite el valor de c: '))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(f'El resultado es: {resultado}')
'''

#ejercicio 2: determinar la solucion logica de la siguiente
#operacion ((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)

'''
a = float(input('Digite el valor de a: '))
b = float(input('Digite el valor de b: '))
resultado = ((3 + 5 * 8 ) < 3 and ((- 6/3 * 4 ) + 2 < 2)) or ( a > b)
print(f'El resultado es: {resultado}')
'''
'''
#ejercicio 3: intercambiar el valor de dos variables.
#Por ejemplo:
#a = 10  a = 5
#b = 5    b = 10
a = 10
b = 5
print(f'el valor de a es {a} y el valor de b es {b}' )
a = 5
b = 10
print(f'El nuevo valor de a es {a} y el nuevo valor de b es {b}')
'''
'''
ejercicio 4:Área y longitud de un circulo
Hacer un programa para ingresar el radio de un circulo 
y se reporte su área y la longitud de la circunferencia.
Área = Pi * r2
Longitud = 2 * Pi * r
En este ejercicio vamos a necesitar importar el modulo math
porque tiene el valor de Pi
Se escribe:   import math
'''
import math
radio = int(input('Digite el valor de r: '))
area = math.pi * radio ** 2
longitud = 2 * math.pi * radio

print(f'El valor de radio ingresado es {radio}')
print(f'El Area es: {area}')
print(f'La longitud es: {longitud}')

'''
problema 3: Dada una edad de una persona, determine si esta persona
es mayor de edad.
'''
'''
edad = int(input('Digite su edad: '))
if edad >= 18:
    print('Es mayor de edad')
else:
    print('Es menor de edad')
'''















