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
package MyLinkedList;

import Models.Node;

public class MyLinkedList<T> 
{
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
        int ii = 1;
        while(ii < this.length)
        {
            if(ii + 1 == this.length){ // if 2nd to the last
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
