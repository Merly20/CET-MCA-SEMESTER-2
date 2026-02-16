import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NO OF COMPLEX NUMBER U WANT TO ADD:");
        int n = s.nextInt();
        int[] r = new int[n];
        int[] i = new int[n];

        int temp;
        for (temp = 0; temp < n; temp++) {

            System.out.println("ENTER REAL PART OF NO "+ (temp+1)+":");
            r[temp] = s.nextInt();

            System.out.println("ENTER IMAG PART OF NO "+ (temp+1)+":");
            i[temp] = s.nextInt();


        }
                        int rsum=0,isum=0;

        for (temp = 0; temp < n; temp++) {

            rsum+=r[temp];
            isum+=i[temp];


        }
        System.out.println("SUM IS : "+rsum+"+"+isum+"i");
s.close();
    }

}
