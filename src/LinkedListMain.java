
import Models.Node;
import MyLinkedList.MyLinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denise
 */

public class LinkedListMain 
{
    public static void main(String[] args)
    {
        MyLinkedList<String> myList = new MyLinkedList<>();
        MyLinkedList<String> myList2 = new MyLinkedList<>();
        MyLinkedList<String> myStack = new MyLinkedList<>();
       
        String[] items = {"6","5","7", "1", "3", "2", "1"};

        //just add sequentially
        for(String item : items)
        {
            Node<String> newNode = new Node<>();
            newNode.setValue(item);
            myList.AddLast(newNode);        
            //be careful. do not use newNode and add it to newNode2 because 
            //the references are already created when you do addLast on myList.AddLast(newNode) line
            Node<String> newNode2 = new Node<>();
            newNode2.setValue(item);
            myList2.AddFirst(newNode2);
            
            Node<String> newNode3 = new Node<>();
            newNode3.setValue(item);
            myStack.AddLast(newNode3);
        }
        
        
        //order
        System.out.println("First Linked List - " + myList.toString());
        //reverse order
        System.out.println("Second Linked List - " + myList2.toString());
        //remove first item in 2nd linked list
        System.out.println(myList2.RemoveFirst().getValue());
        //remove last item in 2nd linked list
        System.out.println(myList2.RemoveLast().getValue());
        //print new linked list
        System.out.println("Second Linked List - " + myList2.toString());
        System.out.println("Second Linked List Length - " + myList2.getLength());
        
        //remove last twice on first linked list
        System.out.println(myList.RemoveLast().getValue());
        System.out.println(myList.RemoveLast().getValue());
        //print new linked list
        System.out.println("First Linked List - " + myList.toString());
        System.out.println("First Linked List Length - " + myList.getLength());
        
        
        //stack 
        while(myStack.getLength() > 0)
        {
            System.out.println(myStack.RemoveLast().getValue());
        }
    }
}
