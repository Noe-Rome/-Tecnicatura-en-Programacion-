# Ejercicio 5: calcular el factorial de un numero mayor o igual a 0
number = int(input("Enter a number bigger or equal to 0: "))
if number >= 0:
    i = 1
    factorial = 1
    while i <= number:
        factorial *= i
        i += 1
    print(f"The factorial of {number} is {factorial}")
else:
    print("Error. You MUST enter a number bigger or equal to 0")

