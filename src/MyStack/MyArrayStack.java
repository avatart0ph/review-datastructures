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
import java.lang.reflect.Array;

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
