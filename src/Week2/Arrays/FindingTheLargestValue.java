package Week2.Arrays;

import java.util.*;
//Write a program that creates an array which can hold ten values.
// Fill the array with random numbers from 1 to 100. Display the values in the array on the screen.
// Then use a linear search to find the largest value in the array, and display that value.

public class FindingTheLargestValue {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Random num = new Random();
        int[] a = new int[10];
        int l = 0;

        System.out.print("A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + num.nextInt(100);
            System.out.print(a[i] + "  ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (l < a[i]) {
                l = a[i];

            }
        }
        System.out.println();
        System.out.println("\n bigger number is " + l + ".");


    }
}