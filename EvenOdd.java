/**
 * Java Program to Check Whether a Number is Even or Odd
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        EvenOddChecker(number);

    }
    public static void EvenOddChecker(int number){

        // even numbers are divisible by 2 and odd are not divisible
        if(number % 2 == 0)
            System.out.println(number+" is even number");

        else
            System.out.println(number+" is odd number");

    }

}
