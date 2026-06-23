# Práctica: Estructuras Dinámicas No Lineales

## Datos del Estudiante
- **Nombre:** Jorda Sagbay
- **Curso:** grupo 3 

---------------------------------------------------------------------------------------------------------------------------------

## 1. Ejercicio 1

**Fecha:** 22/06/2026

**Descripción:**

El método principal inicia la visualización del árbol binario imprimiendo un encabezado y llamando a la función auxiliar desde la raíz en el nivel cero.
La función auxiliar recorre recursivamente el árbol de forma inversa (derecha, raíz, izquierda) para mostrarlo visualmente de manera horizontal.
En cada nodo visitado, imprime espacios en blanco proporcionales a su nivel de profundidad seguidos del valor numérico del nodo correspondiente.
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




## 2. Ejercico 2

**Fecha:** 22/06/2026
**Descripción:**
El método principal inicia la inversión del árbol binario pasando la raíz a la función auxiliar y finalmente la retorna modificada.
La función auxiliar recorre recursivamente el árbol y se detiene inmediatamente si encuentra un nodo nulo.
En cada nodo, intercambia sus referencias izquierda y derecha usando una variable temporal antes de repetir el proceso en sus hijos.
.......

### Método implementado

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
    

