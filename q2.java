import java.util.Scanner;
public class q2 {
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);

                  System.out.print("ENTER MATRIX SIZE:");
                  int size=s.nextInt();

    System.out.println("ENTER MATRIX1:");
    int i,j;
      int[][] m1 = new int[size][size];
        int[][] m2 = new int[size][size];
        int[][] sum = new int[size][size];
    for(i=0;i<size;i++){
        for(j=0;j<size;j++){
             m1[i][j]=s.nextInt();
        }
    }
        System.out.println("ENTER MATRIX2:");
         for(i=0;i<size;i++){
        for(j=0;j<size;j++){
             m2[i][j]=s.nextInt();
        }
    }

 for(i=0;i<size;i++){
        for(j=0;j<size;j++){
            sum[i][j]=m1[i][j]+m2[i][j];
        }
    }
              System.out.println("SUM OF MATRIX IS:");

     for(i=0;i<size;i++){
        for(j=0;j<size;j++){
          System.out.print(sum[i][j]+" ");
        }
                  System.out.println();

    }

s.close();
    
}

}