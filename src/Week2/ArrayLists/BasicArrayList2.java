package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
//Create an ArrayList of Integers.
// Fill up the list with ten random numbers, each from 1 to 100.
// Then display the contents of the ArrayList on the screen.
//
//You must use a loop to fill up the list. However,
// you may display it the easy way (no loop needed) like so:c

public class BasicArrayList2 {
    public static void main(String[] args){

        ArrayList<Integer> ext = new ArrayList<>();


        for(int i=1; i<=10; i++){
            ext.add(getNumbers());

        }System.out.println("ArrayList: "+ext);
    }
    private static int getNumbers(){

        Random num = new Random();

        return 1+num.nextInt(100);
    }
}
