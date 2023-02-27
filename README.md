# Ejercicio 41 - Archivo strings.xml
Crear un proyecto que solicite la carga de dos valores. Mediante dos RadioButton permitir seleccionar si queremos sumar o restar. Cuando se presione un botón mostrar en un TextView el resultado de la operación.
# Implementación
URL : https://github.com/phob0z/appMovilesEjercicio41

El archivo strings.xml se utiliza para almacenar todas las constantes de cadenas de caracteres que se necesitan en un programa, por ejemplo: las etiquetas de los objetos Button, los textos de los controles TextView y todos los controles que muestran un texto en el dispositivo.

La idea fundamental es tener todos los mensajes que muestra nuestra aplicación en un archivo, el strings.xml. Una de las ventajas que presenta agrupar los textos en este archivo es la posibilidad de implementación de múltiples idiomas en la aplicación.

En la carpeta res -> values, se pueden encontrar tanto el archivo colors.xml donde se pueden definir los colores a usar en la aplicación como el strings.xml que es el que nos insteresa para este ejercicio. Aquí se pueden definir todas las cadenas de texto, así como el idioma.

![image](https://user-images.githubusercontent.com/110379/218599029-955a4310-6b92-4523-9531-048eadd965a9.png)

Este archivo se puede editar manualmente

![image](https://user-images.githubusercontent.com/110379/218599049-c0454871-026e-43ea-9f10-825df6f18c39.png)

O a través del Resource Manager

![image](https://user-images.githubusercontent.com/110379/218599072-6c0a9d57-73e8-49f8-be7c-fb87bbc04756.png)

![image](https://user-images.githubusercontent.com/110379/218599078-8fb5df88-8d7e-4323-970b-c0abd6da1c88.png)

![image](https://user-images.githubusercontent.com/110379/218599092-aa504bbf-335e-486b-8ae8-a3763261a128.png)

Y se agregará al archivo strings.xml correspondiente con el/los idioma/s

![image](https://user-images.githubusercontent.com/110379/218599103-0c77ca01-a033-4b57-85e8-471e9618f363.png)

Una vez agregados todos los ítems de la interfaz

![image](https://user-images.githubusercontent.com/110379/218599115-bf83ce93-5f38-4fa7-928c-1eed8ecb2346.png)

Y asignados los id de cada elemento, se le puede agregar la propiedad text o hint entre otras, a alguno de las cadenas que se encuentran en el archivo strings.xml

![image](https://user-images.githubusercontent.com/110379/218599131-5ff1c452-3990-43b0-9ae3-7e78b36488db.png)

Por ejemplo, para el primer campo donde se espera el valor uno se tienen las propiedades:

![image](https://user-images.githubusercontent.com/110379/218599145-9adf3538-4e26-465b-b2fa-20e065b57a75.png)

En cambio, en el radio button donde se selecciona la opción de sumar

![image](https://user-images.githubusercontent.com/110379/218599163-62df5a80-fea6-40e0-9840-a958348c245f.png)

Finalmente, el código de la aplicación quedaría de la siguiente manera

![image](https://user-images.githubusercontent.com/110379/218599178-fa829f45-a0c2-4dd4-ad83-4b59f9ba2a7d.png)

![image](https://user-images.githubusercontent.com/110379/218599235-cf6e78b4-f630-4048-a92e-6654a862d263.png)



