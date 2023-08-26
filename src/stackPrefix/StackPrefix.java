package stackPrefix;

public class StackPrefix {

    private static final int N = 3;
    private char[] stackPrefix;
    private int top;

    public StackPrefix() {
        this(N);
    }

    public StackPrefix(int size) {
        this.stackPrefix = new char[size];
        this.top = 0;
    }

    public void push(char item) {
        if (this.isFull()) {
            throw new RuntimeException("Stack is full");
        }
        this.stackPrefix[top] = this.prefix(item);
        this.top++;

    }

    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        this.top--;
        int aux = Character.getNumericValue(this.stackPrefix[top]);
        return aux;

    }

    public char prefix(char item) {

        int aux = Character.getNumericValue(item);
        int result = 0;
        if (aux == -1 && top >= 2) {
            switch (item) {
                case '+' -> {
                    result = this.pop() + this.pop();
                    break;
                }
                case '*' -> {
                    result = this.pop() * this.pop();
                    break;
                }
                case '-' -> {
                    int result1 = this.pop();
                    int result2 = this.pop();
                    result = result2 - result1;
                    break;
                }
                case '/' -> {
                    int result1 = this.pop();
                    int result2 = this.pop();
                    result = result2 / result1;
                    break;
                }
                case '%' -> {
                    int result1 = this.pop();
                    int result2 = this.pop();
                    result = result2 % result1;
                    break;
                }
                default -> {
                    System.out.println("Algo esta mal");
                    break;
                }
            }
        } else {
            return item;
        }

        char result_convert = (char) (result + '0');
        return result_convert;

    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public boolean isFull() {
        return this.top == this.stackPrefix.length;
    }

    public void display() {

        for (int i = 0; i < stackPrefix.length; i++) {
            System.out.println("item:" + stackPrefix[i]);
        }

    }
}
