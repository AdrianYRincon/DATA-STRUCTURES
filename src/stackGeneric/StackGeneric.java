
package stackGeneric;

public class StackGeneric<T> {
    private static final int N = 3;
    private final T stackGeneric[];
    private int top;

    
    public StackGeneric() {
        this(N);
    } 
    
    public StackGeneric(int size) {
        this.stackGeneric = (T[]) new Object[size];
        this.top = 0;
    }
    
    public void push(T item) {
        if (this.isFull()) {
            throw new RuntimeException("Stack is full");
        }
        this.stackGeneric[top] = item;
        this.top++;

    }
     public T pop() {
        if(this.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        this.top--;
        return this.stackGeneric[top];
        
    }
     
  
    public boolean isEmpty() {
       return this.top == 0;
    }
    
    
    public boolean isFull() {
        return this.top == this.stackGeneric.length;
    }
    
    public void display(){
        
        for(int i = 0; i<stackGeneric.length; i++){
            System.out.println("item:"+stackGeneric[i]);
        }
        
    }
    
    
}