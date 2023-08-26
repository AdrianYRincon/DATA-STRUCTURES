
package stackPrefix;

public class Test {
    public static void main(String[] args) {
        StackPrefix stack = new StackPrefix(5);
        stack.push('8');
        stack.push('3');
        stack.push('7');
        stack.push('*');
        
        stack.display();
        
    }
}
