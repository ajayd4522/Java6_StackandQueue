package java6.stacksAndQueues.queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();

        // queue.display();
        // System.out.println(queue.size());

        System.out.println(queue.remove()); // this takes extra time to remove one item
        queue.display();
        queue.insert(133);
        queue.display();
        System.out.println(queue.front());
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        queue.insert(8);
        queue.insert(7);
        queue.insert(6);
        queue.insert(9);
        queue.insert(10);
        queue.display();
        // System.out.println(queue.size());

        // System.out.println(queue.remove());
        // queue.insert(154);
        // queue.display();
        // System.out.println(queue.size());

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // queue.display();
        // System.out.println(queue.size());
    }
}
