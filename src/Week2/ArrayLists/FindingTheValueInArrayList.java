package Week2.ArrayLists;

import java.util.*;
//Create an ArrayList that can hold Integers,
// and fill each slot with a different random value from 1-50.
// Display those values on the screen, and then prompt the user for an integer.
// Search through the ArrayList, and if the item is present, say so.
// It is not necessary to display anything if the value was not found.
// If the item is in the ArrayList multiple times,
// it's okay if the program prints the message more than once.


public class FindingTheValueInArrayList {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int[] x = new int[10];
        Random num = new Random();
        System.out.print("A: ");

        for(int i=0; i<x.length; i++){
            x[i]=1 + num.nextInt(50);
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.print(" find: ");

        int select = keyboard.nextInt();

        System.out.println();
        for (int value : x) {
            if (value == select) {
                System.out.println(select + " on array.");

            }
        }
    }
}
