package com.ranvir.exercise.datastructure;

public class Node<T> {

    private T value;

    private Node<T> next;
    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next===>>>" + next +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public static void main(String[] args) {
        Node<String> n = new Node("Hello");
        (Node n ) -> System.out.println(n);
    }
}
