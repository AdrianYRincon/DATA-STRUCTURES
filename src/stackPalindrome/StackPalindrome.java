
package stackPalindrome;


public class StackPalindrome {
    private char[] stack;
    private int top;

    public StackPalindrome(int size) {
        this.stack = new char[size];
        this.top = 0;

    }

    public void push(char item) {

        if (this.isFull()) {
            System.out.println("stack is full");
            return;
        }

        if (!this.isEmpty()) {

            if (this.stack[top - 1] == item) {
                top--;
                if (top == 0) {
                    System.out.println("Es palindromo");
                    return;
                } else {
                    return;
                }

            } else if (top >= 2) {
                if (this.stack[top - 2] == item) {
                    top--;
                    if (top == 1) {
                        System.out.println("Es palindromo");

                        return;
                    } else {
                        return;
                    }

                }

            }

        }
        this.stack[top] = item;
        this.top++;

    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("stack is empty");
            return 0;
        }
        this.top--;
        return this.stack[top];

    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isFull() {
        return this.top == this.stack.length;
    }

    public void display() {
        System.out.println(this.stack.length);
        for (int i = 0; i < this.stack.length; i++) {
            System.out.println("stack[" + i + "]:" + stack[i]);
        }
    }
}
