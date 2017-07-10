
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
        MyLinkedListStack<String> stacker = new MyLinkedListStack<>();
        String[] items = {"6","5","7", "1", "3", "2", "1"};

        
        for(String item : items)
        {
            stacker.Push(item);
        }
        System.out.println(stacker.toString());
        System.out.println(stacker.Peek());
        int ii = 1;
        while(!stacker.isEmpty())
        {   
            System.out.println("Step: " +  ii + " > Value: " + stacker.Pop());
            ii++;
        }
    }
    
}
