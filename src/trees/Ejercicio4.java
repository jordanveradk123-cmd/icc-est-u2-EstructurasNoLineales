package trees;

import structures.node.Node;

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
