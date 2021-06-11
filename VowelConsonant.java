/**
 * Java Program to Check Whether an Alphabet is Vowel or Consonant
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        System.out.println("Enter the character : ");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        vowelConsonantChecker(ch);
    }

    public static void vowelConsonantChecker(char ch){

        // a,e,i,o,u are only vowels in english rest are consonants
        if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
            System.out.println("The character "+ch+" is a vowel");

        else
            System.out.println("The character "+ch+" is a consonant");

    }
}
