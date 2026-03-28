import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {

    static void checkNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative number not allowed: " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of inputs: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            try {
                checkNumber(num);
                sum += num;
                count++;
            } catch (NegativeNumberException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of positive numbers: " + average);
        } else {
            System.out.println("No positive numbers entered.");
        }

        sc.close();
    }
}