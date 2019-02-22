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
// Program that demonstrates some simple stack/queue operations
public class StackQueue<T> implements StackInterface<T>, QueueInterface<T> {

    private T[] data;
    private int size;

    public StackQueue(int size) {
        data =  (T[]) new Object[size];
    }
    
    @Override
    public boolean isEmpty() {
        return (size) == 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public void push(T e) {
        if (size == data.length) {
            T a[] = (T[]) new Object[size+1];
            int i = 0;
            while (i < size) {
                a[i] = data[i];
                i++;
            }
            data =  (T[]) a;
        }
        data[size] = (T) e;
        size++;

    }
    
    @Override
    public T peekStack() {

        return data[size - 1];
    }
    
    @Override
    public T peekQueue() {

        return data[0];
    }
    
    @Override
    public T pop() {
        T e = peekStack();
        data[size-1] = null;
        size--;
        return  e;
    }
    
    @Override
    public void enqueue(T e) {
        if (size == data.length) {
            T a[] = (T[]) new Object[size+1];
            int i = 0;
            while (i < size) {
                a[i] = data[i];
                i++;
            }
            data =   a;
        }
        data[size] =  e;
        size++;

    }
    
    @Override
    public T dequeue() {
        T e = peekQueue();

        int i = 0;
        while (i < size-1) {
            data[i] = data[i+1];
            i++;
        }
        size--;
        data[size]=null;
        return e;
    }





}
