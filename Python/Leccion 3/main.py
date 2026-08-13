# ciclo while (mientras o durante)
"""contador = 0
while contador < 3:
    print('ejecutamos nuestro ciclo while ', contador)
    contador += 1
else:
    print('fin del ciclo while')"""

# imprimir numeros del 0 al 5 con el ciclo while
"""maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1 """
"""minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1"""

#ciclo for
"""cadena = 'hello'
for letra in cadena:
    print(letra)
else:
    print('fin del ciclo for')"""

#Palabra reservada break
"""for letra in 'Alemania':
    if letra == 'a':
        print(f'letra encontrada: {letra}')
        break
else:
    print('fin del ciclo for')"""

#Palabra reservada continue
"""for i in range(6):
    if i % 2 == 0:
        print(f'Valor {i}')

for i in range(6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')"""
num = 0
i = 1
factorial = 1
while num <= 0:
    num = int(input('Ingrese un numero valido: '))
while i <= num:
    factorial *= num
    num -= 1
else:
    print(f'el factorial es: {factorial}')
    



















