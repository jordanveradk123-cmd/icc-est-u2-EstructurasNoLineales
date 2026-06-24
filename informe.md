# Práctica: Estructuras Dinámicas No Lineales

## Datos del Estudiante
- **Nombre:** Jorda Sagbay
- **Curso:** grupo 3 

---------------------------------------------------------------------------------------------------------------------------------
## Descripcion general del proyecto 
Utilizacion de los diferentes metodos de recorridos de arboles asi mismo la utilizacion de estructuras lineales para alcanzar los objetivos pedidos en esta practica para llegar a al pleno conocimiento de recursividad y recorridos pos orden ,in orden y por niveles.

## Clase InsertBSTTest
**Fecha:** 22/06/2026

**Descripción:**
Construye un arbol binario recorriendo un arreglo de números y insertándolos uno por uno utilizando una función recursiva que compara el valor del nuevo nodo con el nodo actual para decidir que que rama se coloca ,si el nuevo número es menor se coloca  hacia el subárbol izquierdo y en cambio si es mayor o igual avanza hacia el derecho pero cuando encuentra una posición nula, coloca el nuevo nodo en ese lugar manteniendo la estructura ordenada del árbol.
### Captura del código de implementación del ejercicio 1
```java
public class InsertBSTTest {

    public Node<Integer> insert(int[] numeros) {

        if (numeros == null || numeros.length == 0) {
            return null;
        }

        Node<Integer> root = null;

        for (int numero : numeros) {
            root = insertRecursivo(root, new Node<>(numero));
        }

        return root;
    }

    private Node<Integer> insertRecursivo(
            Node<Integer> actual,
            Node<Integer> nuevo) {

        if (actual == null) {
            return nuevo;
        }

        if (nuevo.getValue() < actual.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nuevo));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nuevo));
        }

        return actual;
    }
}
```


## 1. Ejercicio 1

**Fecha:** 22/06/2026

**Descripción:**

El método inicia el árbol binario imprimiendo el encabezado y llamando a la función auxiliar desde la raíz en el nivel cero para que la función auxiliar recorra recursivamente el árbol de forma inversa derecha a la raiz y a la  izquierda para mostrarlo visualmente de manera horizontal para por cada nodo visitado, imprime espacios en blanco dependiendo a su nivel de profundidad seguidos del valor numérico del nodo correspondiente.
### Captura del código de implementación del ejercicio 1
```java
public class Ejercicio1 {

    public void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el arbol:");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {

        if (actual == null) {
            return;
        }

        printTreeRecursivo(actual.getRight(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }

        System.out.println(actual.getValue());

        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
}
```
### Salida de consola
![alt text](image-4.png)




## 2. Ejercico 2

**Fecha:** 22/06/2026
**Descripción:**
El método principal pasa por la raíz a y de hay a la función auxiliar y finalmente la retorna modificada.
La función auxiliar recorre recursivamente el árbol y se detiene inmediatamente si encuentra un nodo nulo por  cada nodo, intercambia sus referencias izquierda y derecha usando una variable temporal antes de repetir el proceso en sus hijos.
.......

### Captura del código de implementación del ejercicio 2

```java
public class Ejercicio2 {

    public Node<Integer> invert(Node<Integer> root) {

        invertRecursivo(root);

        return root;
    }

    private void invertRecursivo(Node<Integer> root) {

        if (root == null) {
            return;
        }

        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invertRecursivo(root.getLeft());
        invertRecursivo(root.getRight());
    }

}
```
### Salida de consola
![alt text](image-5.png)
## 3. Ejercicio 3

**Fecha:** 23/06/2026

**Descripción:**

lo que realiza esta clase es un recorrido por niveles utilizando una cola lo hace cuando agrupa los nodos en listas diferentes según el nivel de profundidad en el que se encuentra para al final devolver una lista principal que contiene todos los niveles ordenados de arriba hacia abajo.
### Captura del código de implementación del ejercicio 3

```java
public class Ejercicio3 {

    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {

        List<List<Node<Integer>>> resultado =
                new ArrayList<>();

        if (root == null) {
            return resultado;
        }

        Queue<Node<Integer>> cola =
                new LinkedList<>();

        cola.add(root);

        while (!cola.isEmpty()) {

            int cantidadNodos = cola.size();

            List<Node<Integer>> nivel =
                    new ArrayList<>();

            for (int i = 0; i < cantidadNodos; i++) {

                Node<Integer> actual = cola.poll();

                nivel.add(actual);

                if (actual.getLeft() != null) {
                    cola.add(actual.getLeft());
                }

                if (actual.getRight() != null) {
                    cola.add(actual.getRight());
                }
            }

            resultado.add(nivel);
        }

        return resultado;
    }
}
```
### Salida de consola
![alt text](image-6.png)
## 4. Ejercicio 4

**Fecha:** 23/06/2026

**Descripción:**

El codigo calcula la profundidad del árbol binario asi mismo con metodo recursivo primero Visita el subárbol izquierdo y derecho de cada nodo para obtener sus profundidades y despues al final toma el valor mayor entre ambos lados y le suma 1 contando el nodo actual para retornar el total.
### Captura del código de implementación del ejercicio 4

```java
public class Ejercicio4 {

    public int maxDepth(Node<Integer> root) {
        return maxDepthRecursivo(root);
    }

    private int maxDepthRecursivo(Node<Integer> actual) {

        if (actual == null) {
            return 0;
        }

        int izquierda = maxDepthRecursivo(actual.getLeft());

        int derecha = maxDepthRecursivo(actual.getRight());

        return Math.max(izquierda, derecha) + 1;
    }
}

```
### Salida de consola
![alt text](image-7.png)

