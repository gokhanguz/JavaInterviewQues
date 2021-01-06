package AllInterviewQuestion;

public class Palindrome_Number {

    /**
     * Create a method that will accept a number (long) and determine ifthe number is palindrome or
     * not.
     */

    public static void main(String[] args) {

    }

    //Approach One:
    public static boolean isDigitPalindrome1(long number){
        long temp = number;
        long reverse= 0 ;
        int numOfLoops = String.valueOf(number).length();
        String revStr= "";
        for (int i = 0 ; i <numOfLoops ; i++) {
            revStr+=temp%10 ;
            temp/= 10 ;
        }
        reverse=Integer.parseInt(revStr);
        return reverse==number;
    }

   // Approach Two:
    public static boolean isDigitPalindrome2(long number){
        String num = String.valueOf(number);
        String reverse = String.valueOf(new StringBuilder(num).reverse());
        long reverseLong = Long.parseLong(reverse);
        return reverseLong==number;
    }


    //Approach Three:
    public static boolean isDigitPalindrome3(long number){
        long temp=number;
        long reverseLong = 0 ;
        long lastDigit;
        while (temp!= 0 ){
            lastDigit = temp%10 ;
            reverseLong=reverseLong*10 +lastDigit;
            temp/= 10 ;

        }
        return reverseLong==number;
    }


}
