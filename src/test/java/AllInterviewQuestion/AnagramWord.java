package AllInterviewQuestion;

import java.util.Arrays;
import java.util.TreeSet;

public class AnagramWord {

    public static void main(String[] args) {
        /**
         * Given two Strings determine if they are Anagrams -> Are built ofthe same characters:
         */

        //Approach One:
        String str1 = "listen";
        String str2 = "silent";
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.replaceFirst("" + str1.charAt(i), "");
        }
        System.out.println(str2.isEmpty() ? "Anagram" : "NOT Anagram");

/*
        //Approach Two:
        String str1 = "listen";
        String str2 = "silent";
        String str11 = "";
        String str22 = "";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (char each:ch1) {
            str11+=each;
        }
        for (char each:ch2) {
            str22+=each;
        }
        System.out.println(str11.equalsTo(str22)? "Anagram" : "NOT Anagram");

 */
/*

        //Approach Three:
        public static boolean Same(String str12, String str2) {
            str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );
            str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );
            return str1.equals(str2); }
*/
    }
}
