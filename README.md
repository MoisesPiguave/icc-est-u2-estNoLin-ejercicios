Arboles Binarios.

Ejercicio 1.

insertar dentro del arbol.
Para este metodo primero necesitamos crear un nodo, con sus atributos izquierda y derecha , ademas de el valor que este recibe.
Luego se crean dos metodos de insertar, el normal insertar, que va a tener dentro la la llamda del metodo recursivo para ingresar.

Primero comprara el valor de el nodo es igual a null, es decir esta vacio. si es asi,se crea y se retorna un nuevo nodo con el valor que se ingreso en el metodo.

luego si este valor , es menor al nodo , se envia a la izquierda, caso contrario, el lado derecho, y asi es como vamos ingreando un valor por medio de nodos a un arbol. Ademas la clase tiene el metodo que nos imprime, para poder mostrar luego.




Ejercicio 2.

Invertir un arbol.
Para este metodo primero necesitamos crear un nodo, con sus atributos izquierda y derecha , ademas de el valor que este recibe.( igual que el primero)

Tambien posee dos metodos uno normal y otro recuersivo , el recursivo lo que hace es comparar primero si el nodo es null, luego en una variable temp , vamos a guardar el valor de la raiz de el lado izquierdo, para poder luego cambiarla de posicion con la derecha.

Tambien cuenta con su metodo de impresion 




Ejercicio 3.

Listar nodos por niveles en listas enlazadas.
Para este método creamos primero la clase Nodo con sus atributos izquierda, derecha y valor, igual que en los ejercicios anteriores. Luego, en el método principal usamos una cola para recorrer el árbol nivel por nivel (recorrido BFS). Empezamos agregando la raíz a la cola y mientras la cola no esté vacía, procesamos todos los nodos del nivel actual. Para cada nodo sacado de la cola, guardamos su valor en una lista enlazada correspondiente a ese nivel, y añadimos sus hijos (izquierdo y derecho) a la cola para el siguiente nivel. Así, obtenemos una lista que contiene listas enlazadas con los valores de cada nivel, facilitando visualizar cómo están distribuidos los nodos según su profundidad en el árbol.



Ejercicio 4.

Calcular la profundidad máxima de un árbol binario.
Primero definimos la clase Nodo con sus atributos izquierda, derecha y valor, igual que en los ejercicios anteriores. El método principal usa recursión para calcular la profundidad máxima del árbol. Para cada nodo, se calcula recursivamente la profundidad de su subárbol izquierdo y derecho, y se toma el máximo de ambos sumándole 1 (que representa el nivel actual). Si el nodo es null, la profundidad es 0. De esta manera, el método recorre todo el árbol y devuelve el número máximo de niveles que contiene, es decir, la profundidad máxima.


