package AllInterviewQuestion;

import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {

        //result   9,7,6,3,8
        int[] arr={3,8,9,7,6};
        int n=3;
        System.out.println("str = " + Arrays.toString(arr));
 /* for (int j=0;j<num;j++){
      for (int i = 2; i < str.length; i++) {
          int strindex1=str[0];
          result[0]=str[str.length-1];
          result[1]=strindex1;
          result[i]=str[i-1];
      }

  }

  */
        for(int i = 0; i < n; i++){
            int last;
            last = arr[arr.length-1];
            for(int j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println("str = " + Arrays.toString(arr));

    }
}
