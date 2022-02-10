package org.landivar;

import org.junit.jupiter.api.Test;
import org.landivar.graph.BFS;
import org.landivar.graph.Tree;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private Tree<Integer> root;
    private Tree<Integer> rootFirstChild;
    private Tree<Integer> depthMostChild;
    private Tree<Integer> rootSecondChild;

    @Test
    void givenTree_whenSearchFive_thenNotFound(){
        initTree();
        assertTrue(BFS.search(5, root).isEmpty());
    }

    @Test
    void givenTree_whenSearchFour_ThenRootSecondChild(){
        initTree();
        assertEquals(rootSecondChild, BFS.search(4, root).get());
    }

    private void initTree(){
        root = Tree.of(10);
        rootFirstChild = root.addChild(2);
        depthMostChild = rootFirstChild.addChild(3);
        rootSecondChild = root.addChild(4);
    }

}
