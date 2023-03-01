# Ejercicio31
## Instruccion.
Pintar el fondo de color amarillo y dibujar una serie de lineas con distintos estilos
## Desarrollo
Crear un nuevo proyecto en Android Studio en lenguaje java.

En el archivo activity_main.xml añadir dos botones para cambiar el color del fondo y dibujar las lineas.

![image](https://user-images.githubusercontent.com/74793607/222187381-5d2d4731-298b-4c16-a48b-cfddd22ef8c7.png)

En el archivo MainActivity.java en la clase principal definir las capas y los botones creados anteriormente.

![image](https://user-images.githubusercontent.com/74793607/222187933-f379e3a4-dde2-482b-97b5-9781a814e946.png)

Crear una nueva funcion onCreate en donde se inicializa, define las variables y se vincula a los botones.

![image](https://user-images.githubusercontent.com/74793607/222188988-2fc2395c-6c49-4f23-832f-f3ce12395943.png)

En el primer boton se añade un listener y se define toda la logica para dibujar el canvas y dibujar las lineas mediante la funcion drawLine que necesita los siguientes parametros:
- posición inicial en x 
- posición inicial en y
- ancho
- posición final en y
- y el pincel

![image](https://user-images.githubusercontent.com/74793607/222190036-15a539c1-5ff8-4133-9a76-f9288416f9e7.png)

En el segundo boton se añade un listener y se añade la logica para pintar el fondo de el lienzo de color amarillo, el codigo de color debe ser en Hexadecimal 

![image](https://user-images.githubusercontent.com/74793607/222190333-590e930f-efa0-498f-8b53-51b4a145e2c6.png)


## Resultado
<p align="center"><img width='350px' height='600px' src="https://user-images.githubusercontent.com/74793607/221219036-0d26e3cd-aca6-45e8-80fb-68a8b20ca084.jpg"></p>

<p align="center"><img width='350px' height='600px' src="https://user-images.githubusercontent.com/74793607/221219119-2968b732-1fbd-488d-860a-7c33e48659a2.jpg"></p>


URL: [Link Ej31](https://github.com/Seknys/31Moviles)
