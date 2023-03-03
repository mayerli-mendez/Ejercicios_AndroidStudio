# Ejercicio16
Confeccionar un programa que permita almacenar los datos de articulos. Crear la tabla articulos y definir los campos codigo, descripción del articulo y precio.
El programa debe permitir:
<li/>Carga de articulo.
<li/>Consulta por el codigo.
<li/>Consulta por la descripción.
<li/>Borrado de un articulo ingresando su código.
<li/>Modificación de la descripción y el precioj.
# Implementación
Estas importaciones son necesarias en un archivo de código fuente Java que define una actividad para una aplicación de Android que trabaja con una base de datos SQLite.
Entre las mas importantes estan:
"android.content.ContentValues" es una clase utilizada para almacenar un conjunto de valores que se pueden insertar en una base de datos.
"android.os.Bundle" es una clase utilizada para pasar datos entre diferentes componentes de una aplicación de Android.
"android.database.Cursor" es una clase utilizada para obtener y manipular un conjunto de resultados de una consulta de base de datos.

![image](https://user-images.githubusercontent.com/74801652/222610446-7c815bc6-423d-4083-9fc0-53852265dfc1.png)

El método onCreate() se ejecuta cuando se crea la actividad. El método llama al método setContentView() para establecer el diseño de la actividad, que se define en el archivo de diseño XML "activity_main.xml".

Después de llamar a setContentView(), el código busca tres vistas de EditText en el diseño de la actividad usando findViewById(), que encuentra vistas de un diseño de actividad por su ID. Luego, las referencias de estas vistas se almacenan en variables de instancia de EditText llamadas et1, et2 y et3.

![image](https://user-images.githubusercontent.com/74801652/222610693-991c21e1-2e1b-46bd-9e7d-337cb5ee4935.png)

En el metodo "alta" que se ejecuta cuando se hace clic en un botón en la interfaz de usuario. Lo que hace el método es:
Crear una instancia de la clase AdminSQLiteOpenHelper
Obtener el valor de tres campos de texto de la interfaz de usuario.
Crear un objeto ContentValues y agregar los valores de los campos de texto a él.
Insertar el objeto ContentValues en la tabla "articulos" de la base de datos.
Mostrar un mensaje para informar al usuario que se han guardado los datos del artículo.

![image](https://user-images.githubusercontent.com/74801652/222610977-d71cb5db-bfce-470a-a994-aade3d969c9a.png)

Estas dos funciones realizan consultas a la base de datos SQLite en Android para obtener información de artículos. La primera consulta se realiza por código de artículo y la segunda por descripción. En ambas funciones se crea una instancia de la clase AdminSQLiteOpenHelper que es la encargada de crear y actualizar la base de datos. 

![image](https://user-images.githubusercontent.com/74801652/222611595-7d472010-a4bc-4283-9dec-d007d5eb235f.png)

Estas funciones realizan operaciones de baja y modificación de registros en una base de datos SQLite. Ambas funciones crean una instancia de la clase AdminSQLiteOpenHelper para acceder a la base de datos, luego obtienen los valores de los campos de entrada y ejecutan consultas SQL.

![image](https://user-images.githubusercontent.com/74801652/222611746-ed24da24-3473-4618-85ce-aebeb2f4cf3e.png)

URL :  https://github.com/Leoni23/proyecto16.git

![image](https://user-images.githubusercontent.com/74840012/221088577-f66e12f4-a9ea-4580-b621-2300918721c2.png)
