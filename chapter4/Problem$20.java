package chapter_four;


import java.util.Scanner;

/**
 * 4.20 (Process a string) Write a program that prompts the user to enter a string and
 * displays its length and its last character
 *
 *
 * @Mojtaba Sayadi
 * */

public class Problem$20
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.next();

        System.out.println("its length is " + input.length()
                + " and the last character is " + input.charAt(input.length() - 1));
    }
}
