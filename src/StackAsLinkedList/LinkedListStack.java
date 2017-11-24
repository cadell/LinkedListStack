/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAsLinkedList;

import java.util.NoSuchElementException;

/**
 *
 * @author cadelmonterde
 */
public class LinkedListStack 
{
    class Node
    {
        public Object input;
        public Node next;
    }
    private Node first;
    
    public LinkedListStack()
    {
        first = null; //current head theres nothing in the linked list 
    }
    /**
     * The first time an element is added it means that the linkedList was defined
     * to null at first so when a node is created with push the first input is the
     * object we passed as a parameter and "next" parameter now points to null;
     * On our second round of the push method "first" is no longer set to now it now
     * hold the value of the first object we created. we go on and create a new object
     * and pass our element to that object and we point "next" of the object to the 
     * previous head and now the new head points to the new object, while the old
     * head object is stored in the "next" element of the new head.
     * @param element 
     */
    public void push(Object element)
    {
        Node newNode = new Node(); //init a new node 
        newNode.input = element;  //at the input of the current node object we pass an element
        newNode.next = first; // we point the head to null since its the first element in the linked list
        first =  newNode; // we then set first to newNode note that its no longer empty so first now contains the 
    }
    public Object pop()
    {
        //we dont want to remove anything if theres nothing to remove
        if(first == null)
        {
            throw new NoSuchElementException();
        }
        //The reason why it removes the first element on top of the stack
        //is because the first element is the last element we added which is the
        //current element of the "Node" class
        Object element = first.input;
        first = first.next;// we make the head point to the next element in the stack
        return element;
    }
    public boolean empty()
    {
        return first == null;
    }
}
