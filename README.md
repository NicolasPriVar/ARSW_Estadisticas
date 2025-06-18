# ARSW - Media y desviación estándar de datos 
## Nicolás Prieto Vargas  
## 12/06/2025  
## Descripción  
- Durante esta práctica se va a crear un proyecto en Maven, el cual nos permita obtener la desviación estándar y la media de unos valores, en este caso los valores se encontrarán en dos archivos (column1 y column2)   
---  
## 🔎 Explicación del código 🔎  
- La clase App (principal) calcula la media y la desviación estándar de un conjunto de números almacenados en un archivo llamado data/column(1 o 2).txt. Primero, lee cada línea del archivo, la convierte a un número decimal 
(Double) y la guarda en una lista enlazada genérica (ListaEnlazada<Double>). Luego, usa la clase Calculadora junto con expresiones lambda 
(x -> x) para indicar cómo procesar los elementos de la lista. La función mean calcula el promedio de los valores y stdDev calcula la desviación estándar. Finalmente, 
imprime ambos resultados en consola. Este enfoque demuestra el uso de genéricos y lambdas en Java para procesar datos.
- La clase ListaEnlazada<T> implementa una lista enlazada genérica en Java, lo que permite almacenar elementos de cualquier tipo (T). Internamente utiliza nodos (Node<T>) que contienen un dato y una referencia al siguiente nodo. El método add agrega un nuevo elemento al final de la lista recorriéndola desde el inicio. También mantiene un contador de elementos (size). La clase implementa la interfaz Iterable<T>, lo que permite recorrer la lista con un bucle for-each. Para ello, define un iterador interno que comienza en el primer nodo (head) y avanza uno por uno hasta el final.
- La clase Calculadora define dos métodos genéricos para calcular la media (mean) y la desviación estándar (stdDev) de los elementos de una lista enlazada genérica (ListaEnlazada<T>). Ambos métodos usan la interfaz funcional ToDoubleFunction<T>, lo que permite convertir cada elemento de tipo T a un double, facilitando así el trabajo con datos de distintos tipos. El método mean recorre la lista, aplica la función de conversión a cada elemento y suma los valores para calcular el promedio. El método stdDev primero calcula la media y luego recorre la lista nuevamente, acumulando el cuadrado de las diferencias entre cada valor y la media, para finalmente devolver la raíz cuadrada de la media de esas diferencias al cuadrado. Esta implementación muestra cómo usar genéricos y lambdas en Java.
---
## ⚠️ ¿Lambdas y genéricos? ⚠️  
Los genéricos permiten definir clases, interfaces y métodos con tipos parametrizados, es decir, que pueden trabajar con diferentes tipos de datos sin perder seguridad de tipo.  
#### ¿Por qué usarlos?
- Evitan casts innecesarios.  
- Permiten reutilización de código.  
- Aumentan la seguridad en tiempo de compilación.
  
Una lambda es una forma concisa de escribir una implementación de una interfaz funcional (es decir, una interfaz con un único método abstracto).

---
##  ✅ Realicemos pruebas ✅  
Una manera de probar el código, es colocando en los archivos .txt los números que nos dan en el PDF, para columna 1 son:  
160  
591  
114  
229  
230  
270  
128  
1657  
624  
1503  
Y para columna 2 son:  
15.0  
69.9  
6.5  
22.4  
28.4  
65.9  
19.4  
198.7  
38.8  
138.2  
Según el PDF los resultados deben ser:  
![image](https://github.com/user-attachments/assets/232df72e-0514-4af2-88c0-f70f82a98e1b)  
Y al ejecutar el programa con column1, obtenemos:  
![image](https://github.com/user-attachments/assets/9d86394a-3010-44bf-9544-95a659994112)  
Y para column2, obtenemos:  
![image](https://github.com/user-attachments/assets/45a43a5d-6392-4f97-87bc-7cfdd45b2189)  
Podemos observar que los resultados de la media si corresponden pero los de la desviación estándar no, pero al revisar externamente la desviación de cada columna, da como resultado:
Para column1  
![image](https://github.com/user-attachments/assets/d0b65820-3131-4a02-b485-91f65b7e7ab5)  
Y para column2  
![image](https://github.com/user-attachments/assets/cbf66418-2761-420f-a472-20d115464884)  
Por ende, podemos concluir que si quedó bien el programa y fue un error de cálculos en el PDF.
