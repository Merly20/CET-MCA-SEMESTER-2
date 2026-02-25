import java.util.Scanner;

class Student {
    int roll;
    String name;
    int academicScore;

    Student(int roll, String name, int academicScore) {
        this.roll = roll;
        this.name = name;
        this.academicScore = academicScore;
    }
}

class Sports {
    int sportsScore;

    Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }
}

class Result extends Student {
    int sportsScore;

    Result(int roll, String name, int academicScore, int sportsScore) {
        super(roll, name, academicScore);
        this.sportsScore = sportsScore;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll: ");
        int roll = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Academic Score: ");
        int academic = sc.nextInt();
        System.out.print("Enter Sports Score: ");
        int sports = sc.nextInt();

        Result r = new Result(roll, name, academic, sports);
        r.display();
    }
}