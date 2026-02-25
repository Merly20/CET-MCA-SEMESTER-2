import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    String company_name;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, int age,
             int empid, String company_name, String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherid;

    Teacher(String name, String gender, String address, int age,
            int empid, String company_name, String qualification, double salary,
            String subject, String department, int teacherid) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Empid: " + empid);
        System.out.println("Company: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacherid: " + teacherid);
        System.out.println();
    }
}

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Gender: ");
            String gender = sc.next();
            System.out.print("Address: ");
            String address = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Empid: ");
            int empid = sc.nextInt();
            System.out.print("Company name: ");
            String company = sc.next();
            System.out.print("Qualification: ");
            String qualification = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Subject: ");
            String subject = sc.next();
            System.out.print("Department: ");
            String department = sc.next();
            System.out.print("Teacherid: ");
            int teacherid = sc.nextInt();

            t[i] = new Teacher(name, gender, address, age, empid, company,
                               qualification, salary, subject, department, teacherid);
        }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }
    }
}