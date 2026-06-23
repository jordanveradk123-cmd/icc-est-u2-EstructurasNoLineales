# Práctica: Estructuras Dinámicas No Lineales

## Datos del Estudiante
- **Nombre:** Jorda Sagbay
- **Curso:** grupo 3 
- **Fecha:** 09/0/2026

---

## 1. Implementación de estructuras no lineales

**Fecha:** 17/06/2026

**Descripción:**

Implementanmos metodos de arbolnpara asi recorrer el arbol de las distintas maneras vistas en clase 

![alt text](image-1.png)

![Captura de salida en consola]

### Captura del código de implementación del ejercicio 1

```java
public class IntTree {

    private Node<Integer> root;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = node;
    }

    public void insert(Integer value) { // 10
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
    }

    public void insert(Node<Integer> value) { // 10
        root = insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayoy o nenor y decidir si lo ingerso a la der o izq
        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual + " ");

    }
    private void inOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());

    }
    public void inOrder() {
        inOrderRecursivo(root);
    }

    public void imprimirPorNiveles() {
    // 1. Si el árbol está vacío, no hay nada que imprimir 🕸️
    if (root == null) {
        System.out.println("El árbol está vacío.");
        return;
    }

    // 2. Creamos la cola y metemos la raíz para empezar 👑
    Queue<Node<Integer>> cola = new LinkedList<>();
    cola.add(root);

    System.out.print("Recorrido por Niveles: ");

    // 3. Mientras haya nodos en la cola, seguimos procesando 🔄
    while (!cola.isEmpty()) {
        // Sacamos al primero de la fila 🏃‍♂️
        Node<Integer> actual = cola.poll();
        
        // ¡Lo imprimimos! 🖨️
        System.out.print(actual.getValue() + " ");

        // 4. ¿Tiene hijo izquierdo? ¡Que se ponga a la fila! ⬅️👥
        if (actual.getLeft() != null) {
            cola.add(actual.getLeft());
        }

        // 5. ¿Tiene hijo derecho? ¡También a la fila! ➡️👥
        if (actual.getRight() != null) {
            cola.add(actual.getRight());
        }
    }
    System.out.println(); // Un salto de línea elegante al terminar 🏁
}
public int getAltura() {
    return getAlturaRecursivo(this.root);
}

// Método privado que hace el cálculo real usando recursividad 🕵️‍♂️
private int getAlturaRecursivo(Node<Integer> actual) {
    // Caso base: Si el nodo es nulo, su altura es 0 🕸️
    if (actual == null) {
        return 0; 
    }

    // 1. Conseguimos la altura de la rama izquierda ⬅️
    int alturaIzquierda = getAlturaRecursivo(actual.getLeft());

    // 2. Conseguimos la altura de la rama derecha ➡️
    int alturaDerecha = getAlturaRecursivo(actual.getRight());

    // 3. Comparamos cuál es mayor usando Math.max y le sumamos 1 👑
    return Math.max(alturaIzquierda, alturaDerecha) + 1;
}
private int getPeso(Node<Integer> actual) {
    // Caso base: Si el nodo es nulo, su peso es 0 🕸️
    if (actual == null) {
        return 0; 
    }

    // 1. Conseguimos la altura de la rama izquierda ⬅️
    int alturaIzquierda = getPeso(actual.getLeft());

    // 2. Conseguimos la altura de la rama derecha ➡️
    int alturaDerecha = getPeso(actual.getRight());

    // 3. Comparamos cuál es mayor usando Math.max y le sumamos 1 👑
    return (alturaIzquierda + alturaDerecha) + 1;
}
public int getPeso() {
    return getPeso(root);
}


    // inorder
    // niveles
    // altura    
}
```




## 2. Arboles con objetos 

**Fecha:** 17/06/2026
**Descripción:**
utilizamos el metodo no lineal de arboles para objetos 
.......

### Método implementado

```java
public class BinariTree<T extends Comparable<T>> {

    private Node<T> root;

    public BinariTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        root = insertRecursivo(root, node);
    }

    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }
    
    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());

    }
    public void inOrder() {
        inOrderRecursivo(root);
    }

}
    
```
    


![alt text](image-3.png)