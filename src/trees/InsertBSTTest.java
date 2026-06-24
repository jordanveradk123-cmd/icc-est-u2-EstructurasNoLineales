package trees;

import structures.node.Node;

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