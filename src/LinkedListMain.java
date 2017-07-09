
import java.util.*;

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
//        Node prev = null;
//        for(int ii = items.length - 1; ii >= 0; ii--)
//        {
//            Node newModel = new Node();
//            newModel.setValue(items[ii]);            
//            newModel.setNext(prev);
//            prev = newModel;
//        }
//        Node item = prev;
//        while(item != null)
//        {   
//            System.out.println(item.getValue());            
//            item = item.getNext();
//        }

        for(String item : items)
        {
            myList.AddTail(item);        
        }
        System.out.println(myList.toString());
    }
}
