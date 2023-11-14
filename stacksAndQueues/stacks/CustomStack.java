package java6.stacksAndQueues.stacks;
// Creating our own Stack data structure
public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push (int item)throws StackException{
        // condition is if the stack is full then
        if(isFull()){
            System.out.println("Stack is full");
            throw new StackException("Stack is full!");
            
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop () throws StackException{
        // condition is if the stack is empty then
        if(isEmpty()){
            System.out.println("Stack is empty!");
            throw new StackException("Stack is empty!");
        }

        return data[ptr--];
    }

    public int peek () throws StackException {
        // condition is if the stack is empty then
        if(isEmpty()){
            System.out.println("Stack is empty!");
            throw new StackException("Stack is empty!");
        }

        return data[ptr];
    }

    public int size (){
        return ptr + 1 ;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at the end
    }

    

}
