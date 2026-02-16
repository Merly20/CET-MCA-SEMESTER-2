import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        System.out.println("Enter array size:");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[s];

        System.out.println("Enter names:");
        for (int i = 0; i < s; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Sorted Strings:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}
