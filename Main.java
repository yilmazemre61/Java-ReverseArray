package com.company;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Write a method called reverse() with an int array as a parameter
    // The method should not return any value. In other words, the method is allowed to modify the array parameter
    // In main() test the reverse() method and print the array both reversed and non-reversed
    // To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on
    // For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}



    public static void main(String[] args) {

        int[] array = {1,5,3,7,11,9,15,34,2222,112,34,1,2,-2};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array = " + Arrays.toString(array));


    }


    private static void reverse(int[] array) {

        int maxIndex = array.length -1; // The reason to set maxIndex to 'array.length -1'
        // array.length = 7 (int[] array = {1,5,3,7,11,9,15};) but the elements are (0,1,2,3,4,5,6)
        // So int maxIndex = 6;
        int halfLength = array.length / 2; // The reason to use this
        // If we swap the half of the array, the rest will be automatically swapped
        for (int i=0; i< halfLength; i++) {
            int temp = array[i]; // we initialize the 0 element to 'temp' variable
            // int temp = 1 according to example above (int[] array = {1,5,3,7,11,9,15};)
            array[i] = array[maxIndex - i];// And here
            // array[0] = array[6];
            // array[0] = 15;
            array[maxIndex -i] = temp;// the 'temp' variable was set to the first element in the array
            //int temp = array[0];
            //int temp = 1;
            // So --- array[maxIndex -i] = temp;
            // array[6] = 1;
            // This process is going to run until half.length of the array

        }
    }
}






























