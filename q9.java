import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esalary;
}

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            System.out.print("Enter eno: ");
            e[i].eno = sc.nextInt();
            System.out.print("Enter ename: ");
            e[i].ename = sc.next();
            System.out.print("Enter esalary: ");
            e[i].esalary = sc.nextDouble();
        }

        System.out.print("Enter eno to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (e[i].eno == key) {
                System.out.println(e[i].eno + " " + e[i].ename + " " + e[i].esalary);
                return;
            }
        }

        System.out.println("Employee not found");
    }
}