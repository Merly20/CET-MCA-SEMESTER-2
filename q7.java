import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("ENTER ELEMENTS:");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int found = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
