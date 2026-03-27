import java.io.*;
import java.util.Scanner;
public class q20
{
    public static void main(String args[]){
   
    try{
        File fr=new File("file1.txt");
        Scanner reader=new Scanner(fr);
        while(reader.hasNextLine())
        {
            System.out.println(reader.nextLine());
            
        }
       

    }
    catch (IOException e) 
    {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
    
}