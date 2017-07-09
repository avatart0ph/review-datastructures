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
    
    public int length;
    
    
    public void AddFirst(T newValue)
    {
        Node<T> item = new Node<>();
        item.setValue(newValue);
        if(length == 0)
        {
            this.head = item;
            this.tail = item;
        }else
        {
            item.setNext(this.head);
            this.head = item;
        }
        length++;
    
    }
    
    
    public void Add(T newValue)
    {
        Node<T> item = new Node<>();
        item.setValue(newValue);
        if(length == 0)
        {
            this.head = item;
            this.tail = item;
        }else
        {
            this.tail.setNext(item);
            this.tail = item;
        }
        length++;
    }
    @Override
    public String toString()
    {
        String temp = "";
        
        Node item = this.head;
        while(item != null)
        {   
            temp += item.getValue() + " ";            
            item = item.getNext();
        }
                
        return temp;
    
    }
   
    
}
