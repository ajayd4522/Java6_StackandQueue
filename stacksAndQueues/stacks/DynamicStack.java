package java6.stacksAndQueues.stacks;

// In Dynamic Stack size is not the issue, so if you are inserting elements greater than size it will double the size 
// its most of the methods is same as CustomStack so we are extending CustomStack
// only we have to @Override some methods which are slightly different from super class

public class DynamicStack extends CustomStack{
    
    public DynamicStack (){
        super();
    }

    public DynamicStack (int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException {

        if(isFull()){
            // if it is full double up the size
            int [] temp = new int [data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                
                temp[i] = data[i];
            }

            data = temp;
        }
        // at this point we know that array is not full
        // insert item from method which is written in super class
        return super.push(item);
    } 
}
