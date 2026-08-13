#ejercicio 6: ingresar "N" enteros, visualizar la suma de los numeros pares de la lista
#cuantos numeros pares existen y cual es el promedio de los numeros impares.
elements_number = int(input("Enter the amount of elements to enter: "))
i = 1
even_addition = 0
even_counter = 0
odd_addition = 0
odd_counter = 0
while i <= elements_number:
    number = int(input("Enter a number: "))
    if number % 2 == 0:
        even_addition += number
        even_counter += 1
    else:
        odd_addition += number
        odd_counter += 1
    i += 1
if even_counter == 0:
    print("You have not entered any even number")
else:
    print(f"The addition of even numbers is: {even_addition}")
    print(f"The counted of even numbers is: {even_counter}")
if odd_counter == 0:
    print("You have not entered any odd number")
else:
    odd_average = odd_addition / odd_counter
    print(f"The odd average is: {odd_average}")

