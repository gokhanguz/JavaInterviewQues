package AllInterviewQuestion;

public class FIN_RA {
    /**
     * Write a program that prints outthe numbers from 1 to 30 butfor numbers which are a multiple
     * of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA"
     * instead ofthe number. For numbers which are a multiple of both 3 and 5,print "FINRA" instead
     * ofthe number.
     */
    public static void main(String[] args) {
        for(int i= 1 ; i <= 30 ; i++) {
            String print = "";
            if (i % 3 == 0 ) print = "FIN";
            if (i % 5 == 0 ) print += "RA";
            if (print.isEmpty()){
                System.out.println(i);
            } else {
                System.out.println(print);
            }
        }

    }
}
