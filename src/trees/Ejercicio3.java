package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Node;

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