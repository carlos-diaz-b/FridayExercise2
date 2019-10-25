package Week2.Arrays;

import java.util.*;

//Create an array that can hold ten integers,
// and fill each slot with a different random value from 1-50.
// Display those values on the screen, and then prompt the user for an integer.
// Search through the array, and if the item is present, give the slot number where it is located.
// If the value is not in the array, display a single message saying so.
// If the value is present more than once, you may either display the message as many times as necessary,
// or display a single message giving the last slot number in which it appeared.

public class WhereIsIt {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        Random num = new Random();
        int[] a = new int[10];

        int s=0;
        boolean f=false;

        System.out.print("A: ");


        for(int i=0; i<a.length; i++){
            a[i]=1+num.nextInt(50);
            System.out.print(a[i]+"  ");
        }
        System.out.print("\n find: ");
        int value = keyboard.nextInt();
        for(int j=0; j<a.length; j++){
            if(a[j]==value && !f){
                s=j;
                f=true;
            }
        }System.out.println();
        if(f){

            System.out.println(value+" found indx "+s+".");
        }else{
            System.out.println(value+" not found .");
        }
    }
}
