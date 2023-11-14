// https://leetcode.com/problems/implement-queue-using-stacks/description/
// 232. Implement Queue using Stacks
// Easy

// Removal efficient

package java6.stacksAndQueues.leetcodeQuestions;

import java.util.Stack;

public class ImplementQueueUsingStacksRemoval {
    class MyQueue {
        private Stack <Integer> first;
        private Stack <Integer> second;

        public MyQueue() {
            first = new Stack<>();
            second = new Stack<>();

        }
        
        public void push(int x)  {
            while(!first.isEmpty()){
                second.push(first.pop());
            }

            second.push(x);

            while(!second.isEmpty()){
                first.push(second.pop());
            }
        }
        
        public int pop()  {

            int removed = first.pop();
            return removed;
            
        }
        
        public int peek() {

            return first.peek();
            
        }
        
        public boolean empty() {

            return second.isEmpty();
            
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
