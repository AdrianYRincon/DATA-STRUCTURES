
package stack;

public class Test {
    public static void main(String[] args) {
        
        Stack stack = new Stack(6);
        
        System.out.println(stack.isEmpty());
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());//6
        System.out.println(stack.pop());//5
        System.out.println(stack.pop());//4
        System.out.println(stack.pop());//3
        System.out.println(stack.pop());//2

    }
}
