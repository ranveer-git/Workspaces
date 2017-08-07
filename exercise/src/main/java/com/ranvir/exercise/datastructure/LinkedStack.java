package com.ranvir.exercise.datastructure;

import java.util.NoSuchElementException;

public class LinkedStack<T> implements Stack<T> {
    private Node<T> top;
    private int size = 0;

    @Override
    public int length() {
        return size;
    }

    @Override
    public void push(T t){
        Node<T> oldTop = top;
        top = new Node<T>(t);
        top.setNext(oldTop);
        size++;
    }

    @Override
    public T pop(){
        if(isEmpty()){
           throw new NoSuchElementException();
        }
        T t = peek();
        top = top.getNext();
        size--;
        return t;
    }

    @Override
    public T peek(){
        if(isEmpty()) throw new NoSuchElementException();
        return top.getValue();
    }

    @Override
    public boolean isEmpty(){
        return size<=0;
    }
    @Override
    public String toString() {
        return "LinkedStack={" +
                "top=" + top +
                '}';
    }
}
