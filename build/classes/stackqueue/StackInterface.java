/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueue;

/**
 *
 * @author MOZ
 * @param <T>
 */
public interface StackInterface<T> {

        public boolean isEmpty();
        
        public int size();
        
        public void push(T e);
        
        public T peekStack();
        
        public T pop();
        
}
