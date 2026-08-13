#Ejercicio 7: dadas las horas trabajadas de 5 personas y la tarifa de pago
#calcular el salario y la sumatoria de todos los salarios
i = 1
addition = 0
while i <= 5:
    print(f"Salary of the employee {i}")
    hours = float(input("Enter the worked hours per month: "))
    payment_rate = float(input("Enter the payment rate per hour: "))
    salary = hours * payment_rate
    print(f"The salary is:{salary}$")
    addition += salary
    i = i + 1
    print("")
else:
    print(f"The addition of every salary is: {addition}")
    
