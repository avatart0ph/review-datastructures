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
package MyStack;
import Models.LinkedNode;

public class MyLinkedListStack<T> implements IStack 
{
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
        
    private int length;
    
    @Override
    public int getLength(){
        return this.length;
    }
    
    
    @Override
    public T Pop()
    {
        LinkedNode<T> pointer = this.head;
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
        LinkedNode<T> newNode = new LinkedNode<>();
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
        
        LinkedNode item = this.head;
        while(item != null)
        {   
            returnValue += item.getValue().toString() + " ";            
            item = item.getNext();
        }
                
        return returnValue;
    
    }
    
}
