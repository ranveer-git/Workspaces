package com.ranvir.exercise.datastructure;


import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedStackTest {

    private LinkedStack<String> testClass = new LinkedStack<>();
    private LinkedStack<Integer> mInt = new LinkedStack<>();

    @Test
    public void testIsStackEmptyTrue(){
        testClass = new LinkedStack<>();
        assertTrue(testClass.isEmpty());
    }
    @Test
    public void testIsStackEmptyFalse(){
        testClass = new LinkedStack<String>();
        testClass.push("First");
        assertFalse(testClass.isEmpty());
    }
    @Test
    public void testPush(){
        testClass = new LinkedStack<>();
        testClass.push("First");
        testClass.push("2");
        testClass.push("3");
        assertEquals("3", testClass.peek());
    }
    @Test
    public void testPopNonEmptyStack(){
        testClass = new LinkedStack<>();
        testClass.push("First");
        String pop = testClass.pop();
        assertEquals("First",pop);
    }

    @Test(expected = NoSuchElementException.class)
    public void testPopEmptyStack(){
        testClass = new LinkedStack<>();
        String pop = testClass.pop();
    }

    @Test
    public void testNullPush(){

    }
    @Test
    public void testPeekDidNotUpdatedStack(){
        testClass = new LinkedStack<>();
        testClass.push("First");
        assertFalse(testClass.isEmpty());
    }







    @Test
    @SuppressWarnings("unchecked")
    public void testOneThingInStack() {
        mInt.push(1);
        assertEquals(1, mInt.length());
    }

    @Test
    public void testOneThingPopped() {
        int x= 5;
        mInt.push(x);
        int y = mInt.pop();
        assertEquals(x, y);

        x = 3;
        mInt.push(3);
        y = mInt.pop();
        assertEquals(x, y);
    }

    @Test
    public void testTwoThingsInOneThingPopped() {
        int y = 3;
        mInt.push(5);
        mInt.push(y);
        int y1 = mInt.pop();
        assertEquals(1, mInt.length());
        assertEquals(y, y1);
    }


    @Test
    public void testTwoThingsInTwoThinsgPopped() {
        int x = 5;
        int y = 3;
        mInt.push(5);
        mInt.push(3);
        int y1 = mInt.pop();
        int x1 = mInt.pop();
        assertEquals(0, mInt.length());
        assertEquals(y, y1);
        assertEquals(x, x1);
    }

    @Test
    public void testPoppingEmptyStack() {
        try {
            testClass.pop();
            fail();
        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void testPushAnything() {
        testClass.push("Derp.");
        assertEquals(1, testClass.length());
    }

}
