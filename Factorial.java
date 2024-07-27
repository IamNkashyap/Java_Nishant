import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long iterativeFactorial = calculateFactorialIterative(number);
        System.out.println("Iterative: Factorial of " + number + " is " + iterativeFactorial);
        
        long recursiveFactorial = calculateFactorialRecursive(number);
        System.out.println("Recursive: Factorial of " + number + " is " + recursiveFactorial);
        
        scanner.close();
    }

    public static long calculateFactorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long calculateFactorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorialRecursive(n - 1);
        }
    }
}
