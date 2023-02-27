# Ejercicio6
Realizar la carga de dos números en controles de tipo EditText ("Number"). Mostrar un mensaje que solicite la carga de los valores iniciando la propiedad "hint" de cada control. Disponer un control de tipo Spinner que permita seleccionar si queremos sumar, restar, multiplicar o dividir dichos valores. Finalmente mediante un control de tipo Button efectuamos la operación respectiva. Mostramos el resultado en un TextView.
# Implementación

URL : https://github.com/mayerli-mendez/Control-Spinner_AndroidStudio.git

Se realiza la inserción de un control de tipo spinner que se encuentra en la pestaña  Containers como se observa en la siguiente imagen.

  ![image](https://user-images.githubusercontent.com/74840012/221445032-80dd6f7e-7b3f-41a8-a9c1-6aaa5f05bc45.png)


Una vez definida la interfaz, se realiza la funcionalidad como se observa en las siguientes imágenes. 
Se realiza las importaciones correspondientes, después se declara los objetos a utilizar. 

![image](https://user-images.githubusercontent.com/74840012/221446438-136d7e20-b0c8-4794-a270-2f4f2096951b.png)

Después se define el objeto spinner debe ser igual al ID que esta definido en la interfaz.
```
spinner1=findViewById(R.id.spinner);
```
Tambien se define el vector de la lista string que mostrara el Spinner.
```
String []opciones={"sumar","restar","multiplicar","dividir"};
```
Se define y se crea un objeto de clase ArrayAdapter. 
```
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
```

![image](https://user-images.githubusercontent.com/74840012/221446450-9f45a00f-f911-46c9-aa6a-1ae85282d21d.png)

Después  mediante una serie de if anidados verificamos si debemos sumar, restar, multiplicar o dividir como se observa en la siguiente imagen. 

 ![image](https://user-images.githubusercontent.com/74840012/221446460-78562707-b63f-4314-a6f4-4048b1a28643.png)

  Finalmente se obtiene el resultado en el emulador como se observa en la siguiente imagen.
  
![image](https://user-images.githubusercontent.com/74840012/220824846-91784f0c-4c3a-4056-947c-6858bb9d01c8.png)




