/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStack;

/**
 *
 * @author Denise
 */
public interface IStack<T> 
{
    int getLength();
    T Pop();
    void Push(T newValue);
    T Peek();
    boolean isEmpty();
}
