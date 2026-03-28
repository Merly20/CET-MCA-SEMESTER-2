import java.util.Scanner;

class MultiplicationTable5 extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
        System.out.println();
    }
}

class PrimeNumbers extends Thread {
    private int n;
    public PrimeNumbers(int n) { this.n = n; }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public void run() {
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println("Prime number is: " + num);
                count++;
            }
            num++;
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (number of prime numbers to display): ");
        int N = sc.nextInt();

        Thread tableThread = new MultiplicationTable5();
        Thread primeThread = new PrimeNumbers(N);

        tableThread.start();
        primeThread.start();

        try {
            tableThread.join();
            primeThread.join();
        } catch (InterruptedException e) {}

        System.out.println("Threads finished execution.");
        sc.close();
    }
}