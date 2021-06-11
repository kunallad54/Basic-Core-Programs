/**
 * Harmonic Number
 * a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 * (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
 * b. I/P -> The Harmonic Value N. Ensure N != 0
 * c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
 * d. O/P -> Print the Nth Harmonic Value.
 *
 * @author Krunal lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class HarmonicValue {

    public static void main(String[] args) {

        System.out.println("Enter the number to get harmonic value of that number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        float harmonicValue = nthHarmonic(number);

        System.out.println("The harmonic value of "+number+" is : "+harmonicValue);

    }
    public static float nthHarmonic(int number){

        float harmonic = 1;
        int i = 2;

        while(i<=number){

            harmonic += (float) 1/i ;
            i++;

        }

        return harmonic;
    }
}
