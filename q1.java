import java.util.Scanner;

class basics {
    int pcode;
    String pname;
    int prize;

    basics(int c, String n, int p) {
        pcode = c;
        pname = n;
        prize = p;
    }
}

class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF PRODUCTS: ");
        int n = sc.nextInt();

        basics[] products = new basics[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Product Code: ");
            int code = sc.nextInt();

            System.out.print("Product Name: ");
            String name = sc.next();

            System.out.print("Product Price: ");
            int price = sc.nextInt();

            products[i] = new basics(code, name, price);
        }

        
        basics low = products[0];
        for (int i = 1; i < n; i++) {
            if (products[i].prize < low.prize) {
                low = products[i];
            }
        }

        System.out.println("\nLOWEST PRICE PRODUCT:");
        System.out.println("Code: " + low.pcode);
        System.out.println("Name: " + low.pname);
        System.out.println("Price: " + low.prize);

        sc.close();
    }
}
