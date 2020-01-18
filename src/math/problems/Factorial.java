package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        int myFactorial=factorial(num);
        System.out.println("Factorial of entered number is " +myFactorial);



    }

     static int factorial(int number) {

        int output;
        if (number==1) {
            return 1;
        }

        output = factorial(number-1)*number;
        return output;
    }
}
