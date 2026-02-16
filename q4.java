import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MATRIX SIZE: ");
        int s = sc.nextInt();
                    System.out.println("ENTER MATRIX ELEMENTS");

        int[][] m = new int[s][s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                m[i][j]=sc.nextInt();
            }
        }
        int flag=0;
          for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(m[i][j]!=m[j][i]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("GIVEN MATRIX IS NOT SYMMETRIC");
        }
        else{
                        System.out.println("GIVEN MATRIX IS  SYMMETRIC");

        }

sc.close();
    }

}
