import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String bookName;
    double price;

    Book(String publisherName, String bookName, double price) {
        super(publisherName);
        this.bookName = bookName;
        this.price = price;
    }
}

class Literature extends Book {
    Literature(String publisherName, String bookName, double price) {
        super(publisherName, bookName, price);
    }

    void display() {
        System.out.println("Category: Literature");
        System.out.println("Book Name: " + bookName);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    Fiction(String publisherName, String bookName, double price) {
        super(publisherName, bookName, price);
    }

    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Book Name: " + bookName);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Price: " + price);
    }
}

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter category (1-Literature, 2-Fiction): ");
        int choice = sc.nextInt();

        System.out.print("Enter Publisher Name: ");
        String publisher = sc.next();

        System.out.print("Enter Book Name: ");
        String book = sc.next();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        if (choice == 1) {
            Literature l = new Literature(publisher, book, price);
            l.display();
        } else if (choice == 2) {
            Fiction f = new Fiction(publisher, book, price);
            f.display();
        } else {
            System.out.println("Invalid Choice");
        }
    }
}