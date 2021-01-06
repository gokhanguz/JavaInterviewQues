package AllInterviewQuestion;

import java.util.Arrays;

public class SortLettersAndNumbers {

    /**
     *Sort Letters and Numbers from alphanumeric String
     */
    public static void main(String[] args) {
        String str="Ankara2563";
        SortLettersAndNumbersFromString(str);

    }

    public static void SortLettersAndNumbersFromString(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
        }
        String[] arr = str2.split(",");
        str = "";
        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }
        System.out.println(str);

    }
}
