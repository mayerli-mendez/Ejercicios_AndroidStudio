# Ejercicio36
## Instruccion.
Confeccionar una aplicacion e incorporar fuentes True Type externas. Para ello implementaremos una aplicación que muestre un texto con una fuente externa.
## Desarrollo
Crear un nuevo proyecto en Android Studio en lenguaje java.


Crear una nueva carpeta con el nombre de assets y añadir el tipo de fuente para el programa. En este caso es "CarrickGroovy.ttf"

<p align="left"><img width='350px' height='200px' src="https://user-images.githubusercontent.com/74793607/222177628-de2716cd-5144-4c00-aab3-75593215f4e8.png"></p>

Dentro del archivo MainActivity.java crear una nueva clase con el nombre "Lienzo" en donde se implementa una nueva función con el nombre onDraw en donde se prepara el fondo para mostrar el texto y se define los pinceles para dibujar este último.


<p align="left"><img width='400px' height='400px' src="https://user-images.githubusercontent.com/74793607/222178883-a0a2d547-b64b-4100-bc0b-3740f0c5a6b3.png"></p>

Typeface permite incorporar una fuente externa desde la carpeta assets, solo es necesario especificar el nombre de la fuente a usar y además se debe establecer este tipo de fuente en el pincel.

![image](https://user-images.githubusercontent.com/74793607/222181992-9ecbb1a5-e68a-4513-b2e9-77d5dfe7d84b.png)

Por ultimo se dibuja el texto usando la funcion drawText en donde se pasa los siguientes parametros:
- string
- posición inicial en x
- posición inicial en y 
- pincel

![image](https://user-images.githubusercontent.com/74793607/222182444-54c463b6-f821-4619-9132-a711a8d044dc.png)

## Restulado

<p align="center"><img width='350px' height='600px' src="https://user-images.githubusercontent.com/74793607/221592984-8b6fea00-3cc8-4b5d-98fb-a33abab80a49.jpg"></p>


URL: [Link Ej36](https://github.com/Seknys/Android36)
