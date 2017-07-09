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
       
        String[] items = {"6","5","7", "3", "2"};

        //just add sequentially
        for(String item : items)
        {
            myList.Add(item);        
        }
        System.out.println(myList.toString());
    }
}
