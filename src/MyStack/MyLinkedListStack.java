/*
 * Uses Linked list implementation as a Stack
 */
package MyStack;
import Models.Node;

/**
 *
 * @author Denise
 */
public class MyLinkedListStack<T> implements IStack 
{
    private Node<T> head;
    private Node<T> tail;
        
    private int length;
    
    @Override
    public int getLength(){
        return this.length;
    }
    
    
    @Override
    public T Pop()
    {
        Node<T> pointer = this.head;
        int ii = 1;
        while(ii < this.length)
        {
            if(ii + 1 == this.length){ // if 2nd to the 
                this.tail = pointer;
                pointer = this.tail.getNext();
                this.tail.setNext(null);
            }
            if(pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            ii++;
            
        }
        length--;
        return pointer.getValue();
    }
    
    @Override
    public void Push(Object newValue)
    {
        Node<T> newNode = new Node<>();
        newNode.setValue((T)newValue);
        
        if(length == 0)
        {
            this.head = newNode;
        }
        else
        {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
        length++;
    }
    
    @Override
    public T Peek()
    {
        return this.tail.getValue();
    }
    
    @Override
    public boolean isEmpty()
    {
        return length == 0;
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
