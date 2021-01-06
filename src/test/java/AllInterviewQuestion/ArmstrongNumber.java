package AllInterviewQuestion;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /**
         * Create a method that will accept a number and check if the number is an Armstrong number. If
         * the number is an Armstrong number return true otherwise return false.
         */

    }

    //Approach One:
    public static boolean isArmstrongNum(int num) {
        String number = String.valueOf(num);
        int multiplier=number.length();
        int sum= 0 ;
        for (int i = 0 ; i < multiplier; i++) {
            int digit = Integer.parseInt(""+number.charAt(i));
            sum+=Math.pow(digit,multiplier);
        }
        return sum==num;
    }


    /*Approach Two:
    public static boolean isArmstrongNum(int num) {
        String numo = String.valueOf(num);
        intlength =numo.length();
        int number = num;
        inttemp= 0 ;
        int sum= 0 ;
        while (number!= 0 ){
            temp=number%10 ;
            sum+=Math.pow(temp,length);
            number/= 10 ;
        }
        return sum==num;

     */

/*    Approach Three:
              int num= 153 ;
              int sum= 0 ;

              String numStr=String.valueOf(num);
              int power=numStr.length();
              System.out.println(numStr);
              int[] numArr= new int[power];
          for (inti = 0 ; i < numStr.length(); i++) {
              numArr[i]=Integer.parseInt(""+numStr.charAt(i));
           }
          for (int each: numArr) {
              sum+= Math.pow(each,power);
           }
           System.out.println("num = " + num);
           System.out.println("sum = " + sum);

 */


}
