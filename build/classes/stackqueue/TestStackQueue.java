/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueue;



/**
 *
 * @author MOZ
 */
public class TestStackQueue {
    public static void main(String[] args) {
        
        System.out.println("Show Stack Array");
        StackQueue<String> sq1= new StackQueue(5);
        
        sq1.push("A");
        sq1.push("B");
        sq1.push("C");

        System.out.println(sq1.size());
        sq1.pop();
        System.out.println(sq1.peekStack());
        System.out.println(sq1.size());
        System.out.println(sq1.isEmpty());
        
        sq1.push("D");
        sq1.push("E");
        sq1.push("F");
        
        System.out.println(sq1.peekStack());
        System.out.println(sq1.size()+"\n");
        
        //----------------------------------------------//
        
        System.out.println("Show Queue Array");
        StackQueue<String> sq2= new StackQueue(3);
        sq2.enqueue("Z");
        sq2.enqueue("Y");
        sq2.enqueue("X");
        sq2.enqueue("W");
        
        System.out.println(sq2.size());
        sq2.dequeue();
        System.out.println(sq2.peekQueue());
        System.out.println(sq2.size());
        
        sq2.dequeue();
        sq2.dequeue();
        System.out.println(sq2.peekQueue());
        sq2.dequeue();
        System.out.println(sq2.peekQueue());
        System.out.println(sq2.isEmpty());
        
        
        
        

        
        
        
        
    }
}
