package java6.stacksAndQueues.queues;

public class DynamicQueue extends CircularQueue{
    
    public DynamicQueue (){
        super();
    }

    public DynamicQueue (int size){
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {

        if(isFull()){
            // if it is full double up the size
            int [] temp = new int [data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                
                temp[i] = data[(front + i) % data.length];

            }
            front = 0; 
            end = data.length;
            data = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }

    
}
