/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStack;

import java.lang.reflect.Array;

/**
 *
 * @author Denise
 */
public class MyArrayStack<T> implements IStack{

    private T[] myArray;
    private int length;
    private int maxSize;
    public MyArrayStack(Class<T> c, int maxSize)
    {
        this.maxSize = maxSize;
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final T[] a = (T[]) Array.newInstance(c, maxSize);
        this.myArray = a;
    }
    
    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public T Pop() {
        if(this.length == 0){
            return null;
        }
        
        return this.myArray[--length];
    }

    @Override
    public void Push(Object newValue) {
        if(this.maxSize == length){
            throw new ArrayIndexOutOfBoundsException(String.format("Max length reached! Cannot push value - %s", newValue));
        }
        this.myArray[length++] = (T)newValue;
    }

    @Override
    public T Peek() {
        if(this.length == 0){
            return null;
        }
        return this.myArray[length];
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }
    
}
