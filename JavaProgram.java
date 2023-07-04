import java.util.Scanner;

public class JavaProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Check whether a given number is positive, negative, or zero
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // 2. Print the Fibonacci series up to a given number
        System.out.print("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();

        int prev = 0;
        int current = 1;

        System.out.print("Fibonacci series up to " + limit + ": " + prev + " " + current + " ");

        for (int i = 2; i <= limit; i++) {
            int next = prev + current;
            System.out.print(next + " ");
            prev = current;
            current = next;
        }

        System.out.println();

        // 3. Calculate the average of a list of numbers
        System.out.print("Enter the numbers (enter -1 to stop): ");

        int sum = 0;
        int count = 0;
        int num = scanner.nextInt();

        do {
            if (num != -1) {
                sum += num;
                count++;
            }
            num = scanner.nextInt();
        } while (num != -1);

        double average = (double) sum / count;
        System.out.println("Average: " + average);

        // 4. Find the largest of three numbers
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("Largest number: " + largest);

        // 5. Declare and initialize variables of different data types
        int integerVariable = 10;
        double doubleVariable = 3.14;
        String stringVariable = "Hello, World!";

        System.out.println("Integer variable: " + integerVariable);
        System.out.println("Double variable: " + doubleVariable);
        System.out.println("String variable: " + stringVariable);

        scanner.close();
    }
}
