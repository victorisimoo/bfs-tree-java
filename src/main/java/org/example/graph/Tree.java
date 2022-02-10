package org.example.graph;

import java.util.ArrayList;

public class Tree<T> {
    private T value;
    private ArrayList<Tree<T>> children;

    public Tree(T value){
        this.value = value;
        this.children = new ArrayList<>();
    }

    public static <T> Tree<T> of(T value){
        return new Tree<>(value);
    }

    public Tree<T> addChild(T value){
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);
        return newChild;
    }

    public T getValue(){
        return this.value;
    }

    public ArrayList<Tree<T>> getChildren(){
        return this.children;
    }
}
