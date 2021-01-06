package AllInterviewQuestion;

public class charackerdenkactanevar {
    public static void main(String[] args) {
        /**
         * Write a return method that can find the frequency of characters
         * Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

        //Approach One:
        String str = "AAABBKKAC CDDDWWWBDD";
        String expected = "";
        for (int i= 0 ; i<str.length(); i++){
            int num= 0 ;
            for (int j = 0 ; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    num++;
                }
            }
            expected = str.charAt(i)+ ""+num;
            str = str.replace(""+str.charAt(i), "");
            i=-1;
            System.out.print(expected);
        }


    }
}
