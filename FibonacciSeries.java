import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        // Check if the number of terms is valid
        if (numTerms <= 0) {
            System.out.println("Invalid number of terms. Please enter a positive integer.");
            return;
        }

        System.out.println("Fibonacci series:");
        int firstTerm = 0;
        int secondTerm = 1;

        // Display the first two terms
        System.out.print(firstTerm + " " + secondTerm);

        // Generate and display the remaining terms
        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);

            // Update the values of firstTerm and secondTerm
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();

        scanner.close();
    }
}
