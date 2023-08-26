
package stackGeneric;


public class Test {
    public static void main(String[] args) {
        StackGeneric<Character> stack = new StackGeneric<> (4);
        stack.push('1');
        stack.push('2');
        stack.push('/');
        stack.push('*');
        char xd = '2';
        
        int xd1 = Character.getNumericValue(xd);
        System.out.println(((Object)xd1).getClass().getSimpleName());
    }
}
