// This program is to handle the checked exceptions in a code using the throws method.
// There are mainly two methods "throw" and "throws" .
// The simple difference between both is that throw is used to explicitly throw an exception, while throws is used in a method signature to declare that the method may throw a checked exception.

import java.util.Scanner;

public class CheckedExceptionThrows {
    //defining a method
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for m: ");
        int m = sc.nextInt();
        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();

        CheckedExceptionThrows obj = new CheckedExceptionThrows();
        try {
            System.out.println(obj.divideNum(m,n));
        }
        catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }
    }
}
