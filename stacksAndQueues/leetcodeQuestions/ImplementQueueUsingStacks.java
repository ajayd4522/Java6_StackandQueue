// https://leetcode.com/problems/implement-queue-using-stacks/description/
// 232. Implement Queue using Stacks
// Easy

// Insertion efficient

package java6.stacksAndQueues.leetcodeQuestions;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    class MyQueue {
        private Stack <Integer> first;
        private Stack <Integer> second;

        public MyQueue() {
            first = new Stack<>();
            second = new Stack<>();

        }
        
        public void push(int x)  {
            first.push(x);
        }
        
        public int pop()  {
            while(!first.isEmpty()){
                second.push(first.pop());
            }

            int removed = second.pop();

            while(!second.isEmpty()){
                first.push(second.pop());
            }

            return removed;
            
        }
        
        public int peek() {
            while(!first.isEmpty()){
                second.push(first.pop());
            }

            int peeking = second.peek();

            while(!second.isEmpty()){
                first.push(second.pop());
            }

            return peeking;
        }
        
        public boolean empty() {

            return first.isEmpty();
            
        }
    }
    
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
