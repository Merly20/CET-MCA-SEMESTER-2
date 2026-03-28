import java.util.Scanner;

class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}

public class ValidateUser {

    static void validate(String username, String password) throws InvalidFormatException {

        if (username.matches(".*\\d.*")) {
            throw new InvalidFormatException("Username must not contain numbers!");
        }

        if (!password.matches(".*\\d.*")) {
            throw new InvalidFormatException("Password must contain at least one number!");
        }

        if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new InvalidFormatException("Password must contain at least one special character!");
        }

        System.out.println("Username and Password are in correct format ✅");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String user = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            validate(user, pass);

        } catch (InvalidFormatException e) {
            System.out.println("Format Error: " + e.getMessage());
        }

        sc.close();
    }
}