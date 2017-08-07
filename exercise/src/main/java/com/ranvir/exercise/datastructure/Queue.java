package com.ranvir.exercise.datastructure;

import java.util.NoSuchElementException;

/**
 * Queue data structure which is of type FIFO.
 * @param <T>
 */
public class Queue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return last.getValue();
    }

    public boolean isEmpty(){
        if(size<0){
            throw new IllegalStateException("Queue Underflow. Size < 0");
        }
        return size ==0;
    }

    public void enqueue(T value){
        /*Node<T> newLast = new Node<>(value);
        if(size!=0){
            last.setNext(newLast);
            last = newLast;
        }else{
          last = newLast;
          first = last;
        }*/
        Node<T> oldLast = last;
        last = new Node<T>(value);

        if(isEmpty()) {
            first = last;
        }else{
            oldLast.setNext(last);
        }
        size++;
    }
    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T oldFirst =  first.getValue();
        first = first.getNext();
        size--;
        return oldFirst;
    }

    public int length(){
        return size;
    }
}
