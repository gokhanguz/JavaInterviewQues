package AllInterviewQuestion;

import java.util.Arrays;

public class Sort_intArray {

    public static void main(String[] args) {

        /**
         * Write a return method that can sort an int array in Ascending order without using the sort
         * method ofthe Arrays class:
         */

        int[] arr = {9,4,23,6,78,4};
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                int temp= 0 ;
                if (arr[i]< arr[j]){ // if I change ‘<’ to ‘>’ it will sort from bigger to smaller
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
