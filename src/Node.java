/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denise
 */
public class Node<T> 
{
    
    private T value;

    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    private Node next;
    
    public Node getNext(){
        return next; 
    }
    
    public void setNext(Node nextModel){
        this.next = nextModel;
    }
    

    
}
