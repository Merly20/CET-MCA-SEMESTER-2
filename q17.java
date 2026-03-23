import java.util.Scanner;

public class q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100 by: ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new ArithmeticException("Negative number not allowed!");
            }

            int result = 100 / num;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution finished (finally block)");
            sc.close();
        }
    }
}