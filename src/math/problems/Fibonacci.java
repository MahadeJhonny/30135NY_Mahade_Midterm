package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

         int n=40, t1=0, t2=1;
        System.out.println("upto " + n + ": ");

         while (t1<=n) {
            System.out.print( t1 + " + ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;


        }



    }


}
