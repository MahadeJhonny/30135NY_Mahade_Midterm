package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        {
            Scanner scanner = new Scanner ( System.in );

            // Getting the input string from the user
            System.out.print ( "Enter the First String : " );
            String s1 = scanner.nextLine ();

            System.out.print ( "Enter the second String : " );
            String s2 = scanner.nextLine ();

            if (checkAnagram ( s1, s2 )) {
                System.out.println ( s1 + " and " + s2 + " are Anagrams" );
            } else
                System.out.println ( s1 + " and " + s2 + " are NOT Anagrams" );

            scanner.close ();
        }


    }

    public static boolean checkAnagram(String s1, String s2) {

        return true;
    }


}




