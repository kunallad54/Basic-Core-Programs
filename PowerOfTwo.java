/**
 * Power of 2
 * a. Desc -> This program takes a user Input N and prints a table of the
 * powers of 2 that are less than or equal to 2^N.
 * b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
 * c. Logic -> repeat until i equals N.
 * d. O/P -> Print the year is a Leap Year or not.
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println("Enter the number till you which you want to get the power of 2");
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        powerOfTwo(range);
    }

    public static void powerOfTwo(int range){

        if(range >= 0 && range < 31){

            System.out.println("The powers of 2 are: ");
            int i = 0;

            while(i<=range){

                int power = (int) Math.pow(2, i);
                System.out.println(power);
                i++;

            }

        }

        else{
            System.out.println("Please enter the range between 0 to 31");
        }
    }
}
