import model.Person;
import structures.node.Node;
import trees.BinariTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {

        runIntTree();
        runPersonTree();
    }

    private static void runPersonTree() {
        BinariTree <Person> persontree = new BinariTree<>(); /// CLASE ARBOL
        persontree.insert(new Person("Alice", 30));
        persontree.insert(new Person("Bob", 25));   
        persontree.insert(new Person("Charlie", 35));
        persontree.insert(new Person("David", 28));
        persontree.insert(new Person("Ana", 35));
        persontree.inOrder();
        System.out.println();

    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CLICLOS
        // node5.setLeft(root);

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15
/* 
        System.out.println("pre Order");

        arbolNumeros.preOrder();
        System.out.println("\nPos Order");
        arbolNumeros.posOrder();
        System.out.println("\nIn Order");
        arbolNumeros.inOrder();
        System.out.println("\nPor Niveles");
        arbolNumeros.imprimirPorNiveles();
        System.out.println("\nAltura del árbol: " + arbolNumeros.getAltura());
        System.out.println("Peso del árbol: " + arbolNumeros.getPeso());*/

        System.out.println("\n--- EJERCICIO 1: IMPRIMIR ARBOL ---");
        Ejercicio1 ejercicio = new Ejercicio1();
        ejercicio.printTree(arbolNumeros.getRoot());

        Ejercicio1 e1 = new Ejercicio1();

            System.out.println("\nÁrbol original:");
            e1.printTree(arbolNumeros.getRoot());

            Ejercicio2 e2 = new Ejercicio2();
            e2.invert(arbolNumeros.getRoot());

            System.out.println("\nÁrbol invertido:");
            e1.printTree(arbolNumeros.getRoot());
            

    }
}