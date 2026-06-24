import java.util.List;
import java.util.Set;

import Collections.set.Sets;
import model.Contacto;
import model.Person;
import structures.node.Node;
import trees.BinariTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.InsertBSTTest;
import trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runSets();

        //runIntTree();
        //runPersonTree();
    }

    private static void runSets() {
        Sets sets = new Sets();


        //Primera implemetacion de Set
        System.out.println("Primera implemetacion de Set");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Tamaño del HashSet: " + hashSet.size());
        System.out.println("Contiene 'f': " + hashSet.contains("f"));
        //Segunda implemetacion de Set LinkedHashSet
        System.out.println("\nSegunda implemetacion de Set");
        Set<String> linkedHashSet = sets.construLinkedHashSet();
        System.out.println(linkedHashSet);
        System.out.println("Tamaño del LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Contiene 'A': " + linkedHashSet.contains("A"));
         //Tercera implemetacion de Set TreeSet
        System.out.println("\nTercera implemetacion de TreeSet");
        Set<String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println("Tamaño del TreeSet: " + treeSet.size());
        System.out.println("Contiene 'A': " + treeSet.contains("A"));

        // Cuarta implementación de Set TreeSet con Contactos y comparador
        System.out.println("\nCuarta implementación de TreeSet con comparador");
        Set<Contacto> treeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println(treeSetConComparador);
        System.out.println("Tamaño del TreeSet con comparador: " + treeSetConComparador.size());

        System.out.println("\n  Quinta implementación de HashSet con comparador");
        Set<Contacto> hashSetConComparador = sets.construirHashSetContacto();
        System.out.println(hashSetConComparador);
        System.out.println("Tamaño del HashSet con comparador: " + hashSetConComparador.size());

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

        System.out.println("\n--- BASE DEL ARBOL CON ARRAY ---");

    int[] numeros = {5, 3, 7, 2, 4, 6, 8};

    InsertBSTTest ejercicioInsert = new InsertBSTTest();

    Node<Integer> root = ejercicioInsert.insert(numeros);

    Ejercicio1 impresor = new Ejercicio1();

    System.out.println("\n--- EJERCICIO 01: INSERT BST ---");
    impresor.printTree(root);


    System.out.println("\n--- EJERCICIO 02: INVERTIR ARBOL ---");

    System.out.println("Arbol original:");
    impresor.printTree(root);

    Ejercicio2 ejercicio2 = new Ejercicio2();
    ejercicio2.invert(root);

    System.out.println("\nArbol invertido:");
    impresor.printTree(root);


    System.out.println("\n--- EJERCICIO 03: LISTAR NIVELES ---");

    Ejercicio3 ejercicio3 = new Ejercicio3();

    List<List<Node<Integer>>> niveles =
            ejercicio3.listLevels(root);

    for (List<Node<Integer>> nivel : niveles) {

        for (int i = 0; i < nivel.size(); i++) {

            System.out.print(nivel.get(i).getValue());

            if (i < nivel.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }


    System.out.println("\n--- EJERCICIO 04: PROFUNDIDAD MAXIMA ---");

    Ejercicio4 ejercicio4 = new Ejercicio4();
     System.out.println("\nArbol original:");
    impresor.printTree(root);

    System.out.println(
            "Profundidad: " +  ejercicio4.maxDepth(root));
}

            

    }
