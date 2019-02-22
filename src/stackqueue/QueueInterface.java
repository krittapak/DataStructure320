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
public interface QueueInterface<T> {

        public boolean isEmpty();
        
        public int size();
        
        public void enqueue(T e);
        
        public T peekQueue();
        
        public T dequeue();
        
}
