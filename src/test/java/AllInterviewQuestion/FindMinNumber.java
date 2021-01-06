package AllInterviewQuestion;

import java.util.Arrays;

public class FindMinNumber {
    public static void main(String[] args) {

        /**
         * Write a method that can find the minimum number from an int Array
         */

       // Approach One:
        int[] arr = {9 ,4 ,23 ,6 ,78 ,4 };
        int min = arr[0 ];
        for (int i= 0 ; i<arr.length; i++){
            if (min > arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);

       // Approach Two:
        int[] arr1 = {9 ,4 ,23 ,6 ,78 ,4 };
        Arrays.sort(arr1);
        int min1 = arr[0 ];
        System.out.println(min1);


    }
}
