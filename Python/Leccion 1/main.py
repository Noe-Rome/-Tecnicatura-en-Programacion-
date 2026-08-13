"""
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la Tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# las literales se escriben x856, LA VARIABLE y = x600 y la variable z = 920
print(id(y))
print(id(z))

# tipos Int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "hola a todos"
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "Michael Yackson"+"daddy yankee"
caracteristicas = "mucho pop y regaeton"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1)+ int(numero2))

# tipos Booleanos (bool)
miBooleano = 9>8
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# procesar la entrada del usuario
# funcion input
# resultado = input("Digite un numero: ") # regresa un dato tipo string
# print(resultado)

# conversion en la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)
"""
"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("Resultado de la suma es: ", suma)
print(f"El resultado de la suma es: {suma}")

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es: {division}")
dividendo = operandoA // operandoB
print(f"El resultado de la división (int) es: {dividendo}")
modulo = operandoA % operandoB
print(f"El resultado de la división o residuo (modulo) es: {modulo}")
exponente = operandoA ** operandoB
print(f"El resultado de la exponente es: {exponente}")
"""
'''
alto = int(input('Proporciona el alto del rectangulo: '))
ancho = int(input('Proporciona el ancho del rectangulo: '))
area = alto * ancho
perimetro = (alto + ancho) * 2
print('Area: ',area)
print('Perimetro: ',perimetro)
'''
'''
miVariable3 = 10
print(miVariable3)

# Operadores de reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable = miVariable - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# operadores de comparacion

d = 4
b = 2
resultado = d == b # comprobamos si son iguales
print(resultado)

# operador diferente
resultado = d != b
print(resultado)

# operador mayor que
resultado = d > b
print(resultado)

# operador menor que
resultado = d < b
print(resultado)

# operador menor o igual que
resultado = d <= b
print(resultado)

# operador mayor o igual que
resultado = d >= b
print(resultado)
'''
'''
a = int(input("Digite un numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número PAR ")
else:
    print(f"el valor de a es: {a} es un numero IMPAR")
'''
'''
edadAdulto = 18
edadPersona = int(input("Digite su edad:"))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} años, usted es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} años, usted es menor de edad")
'''
'''
# operadores logicos
a = False
b = False
resultado = a and b
print(resultado)

# operador Or
resultado = b or a
print(resultado)

# operador Not
resultado = not b
print(resultado)
'''
'''
# ejercicio: valor dentro de un rango
valor = int(input("Digite un numero dentro del rango 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f'El valor {valor} esta dentro del rango')
else:
    print(f'El valor {valor} no esta dentro del rango')
'''
'''
# ejercicio con el operador or, operador not
vacaciones = True
diaDescanso= True
if not (vacaciones or diaDescanso):
    print('Tiene trabajo que hacer')
else:
    print('Puede asistir al juego')
'''
'''
# ejercicio: rango entre 20 y 30 años
edad = int(input("Digite su edad: "))
#veinte= edad >= 20 and edad < 30
#print(veinte)
#treinta = edad >= 30 and edad < 40
#print(treinta)

#sintaxis simplificada del operador AND
# if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40): #sintaxis simplificada del operador AND
    print('Estas dentro del rango de los (20\'0) a los (30\'0)')
# if veinte:
# print('Estas dentro del rango de los (20\'0) a los (30\'0)')
#elif treinta:
#   print('Estas dentro del rango de los (30\'0)años')
else:
    print("No estas dentro del rango de los (20'0) a (30'0) años")
'''
'''
# ejercicio: el mayor de dos numeros
numero1 = int(input("Digite el valor para el numero 1: "))
numero2 = int(input("Digite el valor para el numero 2: "))

if numero1 > numero2:
    print('El numero 1 es mayor')
else:
    print('el numero 2 es mayor')
'''
# ejercicio: tienda de libros
print('Digite los siguientes datos del libro')
nombre = input('Digite el nombre del libro: ')
id = int(input('Digite el id del libro: '))
precio = float(input('Digite el precio del libro: '))
envioGratuito = input('Indicar si el libro es gratuito (True/False): ')
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = 'El valor es incorrecto, debe escribir True/False'
print(f'''
      Nombre: {nombre}
      Id: {id}
      Precio: {precio}
      Envio Gratuito?: {envioGratuito}
''')























