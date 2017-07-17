/*
 * Copyright (C) 2017 Denise Michelle del Bando
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author Denise Michelle del Bando
 */
import Models.LinkedNode;
import MyLinkedList.MyLinkedList;

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
            LinkedNode<String> newNode = new LinkedNode<>();
            newNode.setValue(item);
            myList.AddLast(newNode);        
            //be careful. do not use newNode and add it to newNode2 because 
            //the references are already created when you do addLast on myList.AddLast(newNode) line
            LinkedNode<String> newNode2 = new LinkedNode<>();
            newNode2.setValue(item);
            myList2.AddFirst(newNode2);
            
            LinkedNode<String> newNode3 = new LinkedNode<>();
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
