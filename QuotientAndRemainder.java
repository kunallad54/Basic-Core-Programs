/**
 * Java Program to Compute Quotient and Remainder
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend : ");
        int dividend = sc.nextInt();

        System.out.println("Enter the divisor : ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is : "+quotient);
        System.out.println("The remainder is : "+remainder);

    }
}
