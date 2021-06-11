/**
 * Java Program to Swap Two Numbers
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        System.out.println("Enter the two numbers you want to swap : ");
        Scanner  sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        System.out.println("The value of two numbers before swap are: ");
        System.out.println("First Number : "+firstNumber);
        System.out.println("Second Number : "+secondNumber);

        System.out.println("The value of two numbers after swap are: ");
        swap(firstNumber,secondNumber);
    }

    public static void swap(int firstNumber,int secondNumber){

        //have done swapping without using third variable you can do with help of that too
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("First Number : "+firstNumber);
        System.out.println("Second Number : "+secondNumber);
    }
}
