# ARSW - Media y desviación estándar de datos 
## Nicolás Prieto Vargas  
## 12/06/2025  
## Descripción  
- Durante esta práctica se va a crear un proyecto en Maven, el cual nos permita obtener la desviación estándar y la media de unos valores, en este caso los valores se encontrarán en dos archivos (column1 y column2)   
---  
## 🔎 Explicación del código 🔎  
- Este programa en Java calcula la media y la desviación estándar de un conjunto de números almacenados en un archivo llamado data/column2.txt. Primero, lee cada línea del archivo, la convierte a un número decimal 
(Double) y la guarda en una lista enlazada genérica (ListaEnlazada<Double>). Luego, usa la clase Calculadora junto con expresiones lambda 
(x -> x) para indicar cómo procesar los elementos de la lista. La función mean calcula el promedio de los valores y stdDev calcula la desviación estándar. Finalmente, 
imprime ambos resultados en consola. Este enfoque demuestra el uso de genéricos, lambdas y colecciones personalizadas en Java para procesar datos de forma flexible. 
---
## ⚠️ Datos importantes ⚠️  
- BufferedReader lee el archivo  
- trim () elimina espacios para detectar líneas vacías.  
---
##  ✅ Realicemos pruebas ✅  
Para este proyecto, realizamos varias pruebas para cada método usado, en resumen encontramos que:  
- testContarLineasFisicas: Verifica que el método contarLineasFisicas cuente correctamente todas las líneas (vacías, comentarios y código) del archivo Ejemplo.java.
- testContarLineasLogicas: Verifica que contarLineasLogicas cuente correctamente solo las líneas de código real (ignorando comentarios y líneas vacías) en Ejemplo.java.
- testArchivoSoloConSaltosDeLinea: Crea un archivo temporal con solo saltos de línea y prueba que contarLineasFisicas los cuente como líneas físicas.
- testArchivoConComentariosYCodigo: Crea un archivo con comentarios (//, / /) y una línea de código. Verifica que contarLineasFisicas cuente todas las líneas.
- testArchivoConCodigoYLineasVacias: Crea un archivo con código y líneas vacías, y verifica que contarLineasLogicas ignore las vacías y cuente solo las de código.
- testArchivoConComentariosMultilinea: Crea un archivo con comentarios multilínea y una línea de código. Verifica que contarLineasLogicas ignore los comentarios y cuente solo la línea de código.
Al ejecutar las pruebas, vemos que quedaron bien y elñ programa funciona correctamente.  
![image](https://github.com/user-attachments/assets/58c86fdb-1f1e-4e78-b272-fa09b100b5cb)  
La estructura del proyecto quedó de la siguiente manera (ignorando la carpeta target)  
![image](https://github.com/user-attachments/assets/feae03be-055d-40be-9607-f3915d4f5dbb)  
Para hacer la prueba desde la línea de comandos, ejecutamos el siguente  "java src/main/java/edu/escuelaing/arsw/App.java phy src/main/java/edu/escuelaing/arsw/Ejemplo.java"  
Dando como resultado:  
![image](https://github.com/user-attachments/assets/1e566f54-57a4-47ad-b036-25d5f93ffaa0)  
Y si lo comprobamos...  
![image](https://github.com/user-attachments/assets/428dba2f-cf05-4e61-baf0-6ff1da256a41)  
Y ahora probamos el comando  
"java src/main/java/edu/escuelaing/arsw/App.java loc src/main/java/edu/escuelaing/arsw/Ejemplo.java"  
Dando como resultado:  
![image](https://github.com/user-attachments/assets/dba4b359-9e86-4799-a90c-87ecadaccf44)  
Y si lo comprobamos...  
![image](https://github.com/user-attachments/assets/a58c6459-01f2-4c87-8af4-8016ee40be9c)  
Quedó todo bien.
