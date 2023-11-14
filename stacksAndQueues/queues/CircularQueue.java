package java6.stacksAndQueues.queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0; // can also use two pointers start and end, one for removing and one for inserting elements
    protected int front = 0;
    private int size = 0;


    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {

        this.data = new int[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length; // ptr is at the end
    }

    public boolean insert (int item) throws Exception{
        if(isFull()){
            System.out.println("Stack is full");
            throw new Exception("Stack is full!");
            
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;


    }


    public int remove () throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front () throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return data[front];
    }

    public void display () throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }

        int i = front;

        do {
            System.out.print(data[i++] + " -> ");
            i %= data.length;

        } while (i != end);
        System.out.println("End");
        
    }

    // public void display () throws Exception{
    //     if(isEmpty()){
    //         throw new Exception("Queue is empty!");
    //     }

    //     for (int i = front; i < end; i++) {
    //         System.out.print(data[i] + " -> ");
    //     }

    //     System.out.println("End");
    // }
}
