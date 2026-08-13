#Ejercicio 4: etapas de vida
#pedimos que ingrese la edad al usuario
edad = int(input('Ingrese su edad: '))
if  0<= edad <=10:
    print('La infancia es increible y bella')
elif 10<= edad <= 19:
    print('Tienes muchos cambios, mucho que estudiar')
elif 20<= edad <= 29:
    print('Amor y comienza el trabajo')
elif 30<= edad <= 39:
    print('seguir trabajando y creando la familia')
elif 40<= edad<= 49:
    print('disfrutar de la familia y la buena compañia')
elif 50<= edad<= 59:
    print('hora de consentir a los nietos')
elif 60<= edad <= 69:
    print('es un poco mas lento pero se disfruta de lo vivido')
elif 70<= edad <= 79:
    print('un tiempo para ver todo lo creado y lo felices que fuimos')
elif 80<=edad <= 89:
    print('algunos ya no están pero otros seguirán, fue bueno')
elif 90<= edad <= 100:
    print('que afortunado, solo pocos llegan hasta aqui')
else:
    print('edad invalida, por favor ingrese su edad')
