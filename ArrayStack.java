public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }
    
// The number of items on the stack
    public int size(){
        return size;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        boolean p=true;
        if(size==0)
        {
            return p;
        }
        return false;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        if(data.length==size)
        {
            throw new StackOverflowException();
        }
        else
        {
            data[size]=e;
            size++;
        }
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        
        if(size==0)
        {
            throw new StackUnderflowException();
        }
        else
        {
            int top=size-1;
            Object p=data[top];
            data[top]=null;
            size--;
            return p;
        }
        
        
        //return null;
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        if(size==0)
        {
            throw new StackUnderflowException();
        }
        else
        {
            int top=size-1;
            Object p=data[top];
            return p;
        }
        // return null;
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        int top=size-1;
        String q=" ";
        for(int i=top; i>=0; i--)
        {
            q= q+" "+data[i];
        }
        return q;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object []s=new Object[data.length];
        int top=size-1;
        String q=" ";
        int p=0;
        for(int i=top; i>=0 ;i--)
        {
            s[p]=data[i];
            p++;
        }
        return s;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        int c=0;
        int top=size-1;
        for(int i=top;i>=0; i--)
        {
            if(data[i]==e)
            {
                return c;
               
            }
             c++;
        }
        
        return -1;
    }
    
}