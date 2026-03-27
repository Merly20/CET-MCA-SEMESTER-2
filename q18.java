import java.io.*;
import java.util.Scanner;
public class q18 {
    public static void main(String args[])
    {
        try
        {
        FileReader f1=new FileReader("file1.txt");
        FileWriter f2=new FileWriter(("file2.txt"));
        int ch;
        while((ch=f1.read())!=-1)
        {
            f2.write(ch);

        }
        f1.close();
        f2.close();

        System.out.println("File copied successfully");
        }
       

    catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
    
}