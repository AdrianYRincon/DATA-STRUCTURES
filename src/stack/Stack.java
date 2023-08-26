package stack;

public class Stack {

    private int[] stack;
    private int contador;

    public Stack(int size) {
        this.stack = new int[size];
        this.contador = 0;
    }

    public void push(int item) {
        if (this.isFull()) {
            System.out.println("stack is full");
            return;
        }
        this.stack[contador] = item;
        this.contador++;

    }

    public int pop() {
        if(this.isEmpty()){
            System.out.println("stack is empty");
            return 0;
        }
        this.contador--;
        return this.stack[contador];
        
    }

    public boolean isEmpty() {
       return this.contador == 0;
    }
    
    
    public boolean isFull() {
        return this.contador == this.stack.length;
    }
    public void display(){

        for(int i = 0; i< this.stack.length; i++){
            System.out.println("stack["+i+"]:"+stack[i]);
        }
    }

}