package AllInterviewQuestion;

public class PrimeNumbers_AsalSayi {
    public static void main(String[] args) {

        /**
         * Create a method that will accept a number and print allthe prime numbers from 2 to that given
         * number:
         */

       printPrimeNums(5);

    }
    public static void printPrimeNums(int num) {
        for (int i = 2 ; i <=num ; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int num){
        for (int i = 2 ; i<num; i++){
            if (num%i== 0 ){
                return false;
            }
        }
        return true;
    }
}
