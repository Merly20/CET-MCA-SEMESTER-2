import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empid, String name, double salary, String address,
            String department, String subject) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    void display() {
        System.out.println(empid + " " + name + " " + salary + " " + address +
                           " " + department + " " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Empid: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Address: ");
            String address = sc.next();
            System.out.print("Department: ");
            String dept = sc.next();
            System.out.print("Subject: ");
            String sub = sc.next();

            t[i] = new Teacher(id, name, salary, address, dept, sub);
        }

        System.out.println("Teacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }
    }
}