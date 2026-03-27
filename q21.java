import java.io.*;
import java.util.Scanner;
public class q21{
    public static void main(String args[])
    {
        try{
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();
        FileWriter fw=new FileWriter("file1.txt");
        fw.write(text);
        fw.close();
        }
        catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

    }

    
}