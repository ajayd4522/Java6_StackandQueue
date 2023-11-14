package java6.stacksAndQueues.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExamples {
    public static void main(String[] args) {
        // Stacks
        // this is inbuilt stack, it is class so you can make an object of it
        Stack <Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        System.out.println(stack.peek());
        // System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        stack.search(stack);
        

        // Queues
        // this is inbuilt queue, it is an interface so you cannot create an object of it
        // so you have to create an object which has some methods like queue, LInkedList
        // LILO, FIFO
        Queue <Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());


        // Deque 
        // this is inbuilt deque, spell deck, it is also an interface like queue, so you cannot create an object of it
        // for creating an object, use ArrayDeque
        // Deque means insertion and deletion from both the sides
        // it is faster than stack of object stack and queue as object linkedlist
        Deque <Integer> deque = new ArrayDeque<>();
        deque.add(23);
        deque.addFirst(45);
        deque.addLast(56);
        deque.remove(45);
        deque.removeFirst();
        deque.removeLast();
        // etc etc methods present here

        
    }
}
