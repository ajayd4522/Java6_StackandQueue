package java6.stacksAndQueues.stacks;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);

        System.out.println(stack.data.length);

        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.data.length);
        stack.push(9);
        System.out.println(stack.data.length);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        System.out.println(stack.peek());
        // System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        
    }
}
