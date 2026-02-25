 class shape{
    void area(int a ,int b){
        System.out.println("AREA OF RECTANGLE "+ a*b);
    }
    void area(int x){
        System.out.println("AREA OF "+x*x);
    }
    void area(double a,double b){
        System.out.println("AREA OF TRIANGLE"+0.5*a*b);

    }
    
}
    public class q10 {
    public static void main(String args[]){
        shape s=new shape();
        s.area(2);
        s.area(2.2,3.2 );
        s.area(1,2);

    }
}
    

