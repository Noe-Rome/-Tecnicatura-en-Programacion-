#Diseñar un programa que ingresado un año, nos devuelva por consola si es un año bisiesto o no, repetir la accion hasta
#que el usuario desida.
#num = 0
#opcion = 1
#print("Comprobamos que año es bisiesto")
#while opcion == 1:
    #num=int(input("Ingrese el año:"))
    #if num % 4 == 0 and num % 100 != 0 or num % 400 == 0:
    #    print("El año es bisiesto")
   # else:
  #      print("El año no es bisiesto")

 #   opcion = int(input("Para seguir adelante digite la opcion 1:"))
#print("Fin")


#calcular la suma de N primeros numeros
#N = int(input("Digite la cantidad de numeros a sumarse:"))
#suma = sum(range(1, N + 1))
#print(f"La suma es: {suma}")

# leer 10 numeros e imprimir cuantos son positivos cuantos negativos y cuantos neutros
#conteo_positivos = 0
#conteo_negativos = 0
#conteo_neutros= 0
#i = 1
#while i <= 10:
    #num = int(input("Digite un numero: "))
    #if num > 0:
     #   conteo_positivos +=1
    #elif num < 0:
    #    conteo_negativos +=1
   # else:
  #      conteo_neutros+=1
 #   i += 1
#print(f"La cantidad de positivos es: {conteo_positivos}")
#print(f"La cantidad de negativos es: {conteo_negativos}")
#print(f"La cantidad de neutros es: {conteo_neutros}")

#ejercicio 4 suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos
#realizar un algoritmo para calcular la calificacion promedio y la calificacion mas baja del grupo.

suma = 0
calificacion_baja = 99999

i = 1
while i <= 10:
    calificacion = float(input(f"Digite una calificación: "))
    suma = suma + calificacion
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion
    i = i + 1
calificacion_promedio = suma/10
print(f"La calificacion promedio es: {calificacion_promedio}")
print(f"La calificacion mas baja es: {calificacion_baja}")





























