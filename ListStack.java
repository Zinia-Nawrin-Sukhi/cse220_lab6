public class ListStack implements Stack{
    int size;
    Node top;
    
    
    public ListStack(){
        size = 0;
        top = null;
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
        Node newNode=new Node(e, null);
        if(size==0)
        {
            top=new Node(null, null);
            top.next=newNode;
            size++;
        }
        else
        {
            newNode.next=top.next;
            top.next=newNode;
            size++;
        }
        
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        if(size==0)
        {
            throw  new StackUnderflowException();
        }
        else
        {
            Node rem=top.next;
            Node s=rem.next;
            top.next=s;
            size--;
            return rem;
        }
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        if(size==0)
        {
            throw  new StackUnderflowException();
        }
        else
        {
            Node rem=top.next;
            return rem.val;
        }
        
        //return null;
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        String q=" ";
        for(Node n=top.next; n!=null; n=n.next)
        {
            q = q+" "+n.val;
        }
        return q;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object []s=new Object[size];
        int c=0;
        for(Node n=top.next; n!=null; n=n.next)
        {
            s[c]=n.val;
            c++;
        }
        return s;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        int c=0;
        for(Node n=top.next; n!=null; n=n.next)
        {
            if(n.val==e){return c;}
            c++;
        }
        return -1;
    }
}