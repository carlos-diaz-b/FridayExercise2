package Week2.Arrays;

import java.util.*;
//Write a program that creates an array of ten integers.
// It should put ten random numbers from 1 to 100 in the array.
// It should copy all the elements of that array into another array of the same size.
// Then display the contents of both arrays.
// To get the output to look like mine, you'll need a several for loops.
//
//Create an array of ten integers
//Fill the array with ten random numbers (1-100)
//Copy the array into another array of the same capacity
//Change the last value in the first array to a -7
//Display the contents of both arrays
public class CopyingArrays {


    public static void main(String[] args){

        Random num = new Random();
        int y = 1+num.nextInt(100);

        int[] x = new int[10];

        int[] z = new int[10];
        System.out.print("Array 1: ");

        for(int a=0; a<x.length; a++){
            x[a] = 1+num.nextInt(100);
            System.out.print(x[a]+"  ");
        }
        z = x;
        x[x.length - 1] = -7;
        System.out.println();

        System.out.print("Array 2: ");
        for (int i : z) {
            System.out.print(i + "  ");
        }
    }
}
