
import MyStack.IStack;
import MyStack.MyArrayStack;
import MyStack.MyLinkedListStack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denise
 */
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
