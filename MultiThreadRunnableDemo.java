import java.util.Scanner;

class Fibonacci implements Runnable {
    private int n;
    public Fibonacci(int n) { this.n = n; }

    public void run() {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Fibonacci number is: " + a);
            int next = a + b;
            a = b;
            b = next;
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

class EvenNumbers implements Runnable {
    private int start, end;
    public EvenNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number is: " + i);
            }
            try { Thread.sleep(150); } catch (InterruptedException e) {}
        }
    }
}

public class MultiThreadRunnableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (number of Fibonacci numbers): ");
        int N = sc.nextInt();

        System.out.print("Enter start of range for even numbers: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range for even numbers: ");
        int end = sc.nextInt();

        Thread fibThread = new Thread(new Fibonacci(N));
        Thread evenThread = new Thread(new EvenNumbers(start, end));

        fibThread.start();
        evenThread.start();

        try {
            fibThread.join();
            evenThread.join();
        } catch (InterruptedException e) {}

        System.out.println("Threads finished execution.");
        sc.close();
    }
}