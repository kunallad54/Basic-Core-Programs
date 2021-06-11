/**
 * Leap Year
 * a. I/P -> Year, ensure it is a 4 digit number.
 * b. Logic -> Determine if it is a Leap Year.
 * c. O/P -> Print the year is a Leap Year or not.
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        leapYearChecker(year);
    }

    public static void leapYearChecker(int year){

        if(year < 1000 && year > 9999){
            System.out.println("Please Enter 4 digit number");
        }


        else{

            //conditions for year to be leap year
            if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
            {
                System.out.println("The year "+year+" leap year");
            }

            else{
                System.out.println("The year "+year+" is not leap year");
            }
        }

    }
}
