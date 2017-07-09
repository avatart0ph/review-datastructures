/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denise
 */
public class MyLinkedList<T> 
{
    public MyLinkedList()
    {
        length = 0;

    }
    private Node<T> head;
    
    public Node<T> getHead(){
        return this.head;
    }
    
    private Node<T> tail;
    
    public Node<T> getTail(){
        return this.tail;
    }
    
    private int length;
    
    public int getLength(){
        return this.length;
    }
    
    
    //add on first of linkedlst
    public void AddFirst(Node<T> newValue)
    {
        if(length == 0)
        {
            this.tail = newValue;
        }
        else
        {
            newValue.setNext(this.head);
        }
        this.head = newValue;
        length++;
    }
    
    //add on last
    public void AddLast(Node<T> newValue)
    {
        if(length == 0)
        {
            this.head = newValue;
        }
        else
        {
            this.tail.setNext(newValue);
        }
        this.tail = newValue;
        length++;
    }
    
    //remove first
    public Node<T> RemoveFirst()
    {
        Node<T> returnValue = this.head;
        
        this.head = this.head.getNext();
        length--;
        return returnValue;
    }
    
    //remove last
    public Node<T> RemoveLast()
    {
        Node<T> pointer = this.head;
        int ctr = 1;
        while(ctr <= this.length)
        {
            //get last
            if(ctr == this.length - 1)
            {
                //update tail
                this.tail = pointer;
                this.tail.setNext(null);
                
            }
            if(pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            
            
            ctr++;
        }
        length--;
        return pointer;
    }
    
    
    
    @Override
    public String toString()
    {
        String returnValue = "";
        
        Node item = this.head;
        while(item != null)
        {   
            returnValue += item.getValue().toString() + " ";            
            item = item.getNext();
        }
                
        return returnValue;
    
    }
   
    
}
