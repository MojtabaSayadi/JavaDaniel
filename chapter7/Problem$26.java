package chapter_seven;

import java.util.Scanner;

/**
 * 7.26 (Check whether array is sorted) An array list is required to be sorted in ascending
 * order. Write a method that returns true if list is sorted, using the following header:
 * public static boolean isSorted(int[] list)
 *  Write a test program that prompts the user to enter a list of integers. Note the first
 * number in the input indicates the number of elements in the list. This number is
 * not part of the list.
 *
 *
 *          Enter list: 5 2 5 6 9 10
 *          The list is sorted
 *
 *          Enter list: 5 2 5 6 1 6
 *          The list is not sorted.
 *
 * @ Mojtaba Sayadi
 * */


public class Problem$26
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list: ");
        int size = scanner.nextInt();

        int previous = scanner.nextInt();
        boolean sorted = true;
        for (int i = 1; i < size; i++)
        {
            int next = scanner.nextInt();
            if (previous > next)
            {
                System.out.println("The list is not sorted.");
                sorted = false;
                break;
            }
		previous =next;
        }

        if (sorted)
            System.out.println("The list is sorted");
    }
}
