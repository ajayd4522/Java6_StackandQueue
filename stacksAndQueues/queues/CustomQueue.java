package java6.stacksAndQueues.queues;

public class CustomQueue {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0; // can also use two pointers start and end, one for removing and one for inserting elements

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {

        this.data = new int[size];
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length; // ptr is at the end
    }

    public int size (){
        return end ;
    }

    public boolean insert (int item) {
        if(isFull()){
            return false;
        }

        data[end++] = item;
        return true;


    }

    // this remove method is taking O(n) time for remove an item, which is bad
    // thats why we have circular queue
    public int remove () throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }

        int removed = data[0];

        // shift the element to right
        for (int i = 1; i < end; i++) {
            
            data[i-1] = data[i];
        }

        end--;
        return removed;
    }

    public int front () throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return data[0];
    }

    public void display (){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " -> ");
        }

        System.out.println("End");
    }
}
