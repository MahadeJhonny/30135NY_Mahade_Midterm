package math.problems;

public class MakePyramid {
      public static void main(String[] args) {
      int n=5;
      printTriangle(5);



        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *


        */
    }

    public static void printTriangle(int n) {
        for (int i=0;i<n;i++) {
            for(int j=n-i;j>1;j++) {
                System.out.println(" ");
            }
            for (int j=0;j<=i;j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }


  }
