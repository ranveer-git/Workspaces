package com.ranvir.exercise.datastructure;


public interface Stack <T> {
    int length();

    void push(T t);

    T pop();

    T peek();

    boolean isEmpty();
}
