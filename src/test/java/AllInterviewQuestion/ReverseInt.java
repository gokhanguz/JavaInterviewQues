package AllInterviewQuestion;

import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {

        int[] nums ={5,6,8,6,23};
        int lastdigit=nums.length-1;
        for(int i=0;i<nums.length/2;i++) {
            int temp=nums[i];
            nums[i]=nums[lastdigit];
            nums[lastdigit]=temp;
            lastdigit--;
        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}
