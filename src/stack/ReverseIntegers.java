
package stack;

import java.util.Scanner;


public class ReverseIntegers {
    
     public static void main(String[] args) {
        int number;
        Stack stack = new Stack(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer or a -1 to stop");
        number = scanner.nextInt();
        
        while( number >=0 && !stack.isFull()){
            stack.push(number);
            System.out.println("Enter an integer or a -1 to stop");
            number = scanner.nextInt();
        }
        
        System.out.println();
        System.out.println("The reverse integers are: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println();
        }
        
    }
}
