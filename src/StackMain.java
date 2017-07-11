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
import MyStack.IStack;
import MyStack.MyArrayStack;
import MyStack.MyLinkedListStack;

public class StackMain 
{
    public static void main(String[] args)
    {
        IStack<String> stacker = new MyLinkedListStack<>();
        
        String[] items = {"6","5","7", "1", "3", "2", "1"};
        IStack<String> stacker2 = new MyArrayStack<>(items[0].getClass(), items.length);
        
        for(String item : items)
        {
            stacker.Push(item);
            stacker2.Push(item);
        }
        System.out.println(stacker.toString());
        System.out.println(stacker.Peek());
        int ii = 1;
        while(!stacker.isEmpty())
        {   
            System.out.println("Step: " +  ii + " > Value: " + stacker.Pop());
            ii++;
        }
        try
        {
            stacker2.Push("should fail");
            
        }catch(Exception ex)
        {
            System.out.println("Failed " + ex.getMessage());
        
        }
        System.out.println("Array implementation");
        ii = 1;
        while(!stacker2.isEmpty())
        {   
            System.out.println("Step: " +  ii + " > Value: " + stacker2.Pop());
            ii++;
        }
    }
    
}
