package AllInterviewQuestion;

public class FindMaxNumber {
    public static void main(String[] args) {

        /**
         * Write a method that can find the maximum number from an int Array
         */

       // Approach One:
        int[] nums = {1 ,4 ,7 ,9 ,3 ,56 ,3 };
        int max= 0 ;
        for (int i = 0 ; i <nums.length ; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);

/*     Approach Two:
        public static int maxValue( int[] n ) {
            int max = Integer.MIN_VALUE;
            for(int each: n)
                if (each > max)
                    max = each;
            return max;

 */


  /*
        Approach Three:
        int[] arr = {9 ,4 ,23 ,6 ,78 ,4 };
        Arrays.sort(arr);
        int max = arr[arr.length-1 ];
        System.out.println(max);

   */
    }




}
