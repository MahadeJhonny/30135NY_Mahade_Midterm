package math.problems;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        try {//unit testing for Factorial
            Assert.assertEquals(Factorial.factorial(5), 120);
            System.out.println("Unit testing passed for factorial");
        }catch (AssertionError ar){
            System.out.println("Unit testing failed for factorial");
        }

        try {//unit testing for FindLowestDifference
            int[] array1 = { 5, 9, 2, 20, 33, 1};
            int[] array2 = {17, 36, 14, 19};
            Assert.assertEquals(FindLowestDifference.lowestDifference(array1,array2),13);
            System.out.println("Unit testing passed for FindLowestDifference");
        }catch (AssertionError as){
            System.out.println("Unit testing failed for FindLowestDifference");
        }
        try{//Unit testing for missing number
            int [] array = new int[]{10, 2, 1, 4, 5};
            int n = 6;
            Assert.assertEquals(FindMissingNumber.missingNumber(array,n),5);
            System.out.println("Unit testing passed for FindMissingNumber");
        }catch (AssertionError as){
            System.out.println("Unit testing failed for FindMissingNumber");
        }










    }
}
