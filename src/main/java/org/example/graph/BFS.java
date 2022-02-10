package org.example.graph;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

public class BFS {
    public static <T> Optional<Tree<T>> search(T value, Tree<T> root){
        Queue<Tree<T>> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Tree<T> currentNode = queue.remove();
            System.out.println(currentNode.getValue() + "");
            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            }else {
                queue.addAll(currentNode.getChildren());
            }

        }
        return Optional.empty();
    }
}
