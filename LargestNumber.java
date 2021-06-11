/**
 * Java Program to Find the Largest Among Three Numbers
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        System.out.println("Enter the three numbers: ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        largestNumberChecker(num1,num2,num3);
    }
    public static void largestNumberChecker(int num1,int num2,int num3){

        //getting largest of three numbers
        if(num1 >= num2 && num1 >= num3)
            System.out.println(num1+" is the largest number");

        else if(num2 >= num1 && num2 >= num3)
            System.out.println(num2+" is the largest number");

        else if(num3 >= num2 && num3 >= num1)
            System.out.println(num3+" is the largest number");

        else
            System.out.println("Error!!!");
    }
}
