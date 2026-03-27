import java.io.*;
import java.util.Scanner;
public class q19 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter f1=new FileWriter("evenfile.txt");
            FileWriter f2=new FileWriter("oddfile.txt");
            System.out.println("Enter the amount of numbers:");
            int n=sc.nextInt();
            System.out.println("Enter the numbers");
            for( int i=0;i<n;i++)
            {
                int num=sc.nextInt();
                if(num%2==0)
                    {
                        f1.write(num + "\n");
                    }
                else
                {
                    f2.write(num + "\n");
                }
                
            }
            f1.close();
            f2.close();
        }
        catch (IOException e) 
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
        sc.close();

    }
    
    
}