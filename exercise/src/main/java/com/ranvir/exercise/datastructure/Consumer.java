package com.ranvir.exercise.datastructure;

/**
 * Created by Ranvirsinh on 7/30/2017.
 */
@FunctionalInterface
public interface Consumer<Node> {
    boolean accept(Node t);
}
