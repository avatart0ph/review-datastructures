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
       
        String[] items = {"6","5","7", "1", "3", "2", "1"};

        //just add sequentially
        for(String item : items)
        {
            myList.Add(item);        
            myList2.AddFirst(item);
        }
        //order
        System.out.println("First Linked List - " + myList.toString());
        //reverse order
        System.out.println("Second Linked List - " + myList2.toString());
        //remove first item in 2nd linked list
        System.out.println(myList2.RemoveFirst());
        //remove last item in 2nd linked list
        System.out.println(myList2.RemoveLast());
        //print new linked list
        System.out.println("Second Linked List - " + myList2.toString());
        System.out.println("Second Linked List Length - " + myList2.getLength());
        
        //remove last twice on first linked list
        System.out.println(myList.RemoveLast());
        System.out.println(myList.RemoveLast());
        //print new linked list
        System.out.println("First Linked List - " + myList.toString());
        System.out.println("First Linked List Length - " + myList.getLength());
    }
}
