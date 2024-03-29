package chapter_six;

import java.util.Scanner;

/**
 * 6.35 (Geometry: area of a pentagon) The area of a pentagon can be computed using
 * the following formula:
 *
 *          Area = (5 * s²) / (4 * tan(π/5))
 *
 * Write a method that returns the area of a pentagon using the following header:
 *  public static double area(double side)
 * Write a main method that prompts the user to enter the side of a pentagon and
 * displays its area. Here is a sample run:
 *
 *          Enter the side: 5.5
 *          The area of the pentagon is 52.04444136781625
 *
 * @ Mojtaba Sayadi
 * */


public class Problem$35
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        System.out.println("The area of the pentagon is " + area(side));
    }

    public static double area(double side)
    {
        return ( 5 * (side * side) ) / ( 4 * Math.tan(Math.PI / 5) );
    }

}
