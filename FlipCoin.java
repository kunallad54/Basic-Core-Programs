/**
 * Flip Coin and print percentage of Heads and Tails
 * a. I/P -> The number of times to Flip Coin. Ensuring it is a positive integer.
 * b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
 * heads
 * c. O/P -> Percentage of Head vs Tails
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        System.out.println("Enter the number of times you want to  flip coin ");
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        coinPercentage(count);
    }

    public static void coinPercentage(int count){

        if(count > 0){

            //flipping coin n number of times
            double tailCount = 0;
            double headCount = 0;

            for (int i = 1; i<=count; i++){
                //generating random number between 0 and 1 and storing in coinResult

                double coinResult = Math.random();

                if(coinResult < 0.5){
                    tailCount++;
                }

                else{
                    headCount++;
                }
            }

            System.out.println("Total no. of times head was flipped is: "+(int)headCount);
            System.out.println("Total no. of times tail was flipped is: "+(int)tailCount);

            double headPercentage = headCount /(double) count * 100;
            double tailPercentage = tailCount /(double) count * 100;

            System.out.println("Head Percentage : "+headPercentage);
            System.out.println("Tail Percentage : "+tailPercentage);
        }

        else{
            System.out.println("Please enter positive value.");
        }

    }
}
