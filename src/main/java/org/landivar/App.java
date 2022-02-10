package org.landivar;

import org.landivar.graph.BFS;
import org.landivar.graph.Tree;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args )  {
        Tree<Integer> root =  Tree.of(10);
        Tree<Integer> rootFirstChild =  root.addChild(2);
        Tree<Integer> depthMostChild = rootFirstChild.addChild(3);
        Tree<Integer> rootSecondChild = root.addChild(4);

        BFS.search(4, root);

    }
}
