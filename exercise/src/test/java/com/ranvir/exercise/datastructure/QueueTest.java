package com.ranvir.exercise.datastructure;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    private Queue<String> q;
    private Queue<Integer> queue;
    @Before
    public void setUp(){
        q = new Queue<>();
        queue = new Queue<>();
    }
    @Test
    public void testIsEmptyWithEmptyQ(){
        assertEquals(true,q.isEmpty());
    }
    @Test
    public void testIsEmptyWithNonEmptyQ(){
        q.enqueue("First");
        assertFalse(q.isEmpty());
        assertEquals(1, q.length());
    }
    @Test
    public void testLengthOf2SizeQ(){
        q.enqueue("One");
        q.enqueue("Two");
        assertEquals(2, q.length());
    }
    @Test(expected = NoSuchElementException.class)
    public void testMoreDequeueThanSize(){
        q.enqueue("One");
        q.enqueue("Two");
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }

    @Test(expected = NoSuchElementException.class)
    public void testEmptyQueuePeek(){
        q.peek();
    }

    @Test
    public void testPeekDoesNotChangeSize(){
        q.enqueue("One");
        q.enqueue("Two");
        q.peek();
        q.peek();
        assertEquals(2,q.length());
    }

    @Test
    public void testIsEmptyAndLengthAreInSync(){
        q.enqueue("One");
        q.enqueue("Two");
        q.dequeue();
        q.dequeue();
        assertEquals(true,(q.length() == 0) == q.isEmpty());
    }


    ////////////////////////////
    @Test
    //the '@Test' annotation marks it as, surprisingly enough, a test.
    //each test will be run independently
    public void testIsEmptyOnEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyOnNotEmpty() {
        queue.enqueue(5);
        assertTrue(!queue.isEmpty());
    }

    @Test
    public void testOneEnqueue() {
        queue.enqueue(5);
    }

    @Test
    public void testOneDequeue() {
        queue.enqueue(5);
        assertTrue(5==queue.dequeue());
    }

    @Test
    public void testOrdering() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(new Integer(1),queue.dequeue());
        assertEquals(new Integer(2),queue.dequeue());
        assertEquals(new Integer(3),queue.dequeue());
    }

    @Test(expected=NoSuchElementException.class)
    public void testDequeueOnEmpty() {
        queue.dequeue();
    }

    @Test
    //this checks to make sure that enqueueing then dequeueing doesn't break isEmpty()
    public void testEmptyAfterDequeue() {
        queue.enqueue(5);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
