package AllInterviewQuestion;

public class kelimedeki_sayilari_bul_topla {

    public static void main(String[] args) {
        /**
         * Create a program that willtake any String and printthe total sum of allthe numbers in the
         * String. Note: numbers can be more than digits from 1-9 so if you have “14” nextto each other it
         * should be considered 14 and not 1 and 4 separate:
         */

        //Approach One:
        String str = "jav45ai15sgre1at82" ;
        int sum = 0 ;
        String num = "";
        for (int i = 0 ; i <str.length() ; i++) {
            if (str.charAt(i)>= '0' && str.charAt(i)<= '9'){
                num += str.charAt(i);

                if (i==str.length()-1 || !(str.charAt(i+ 1 )>= '0' && str.charAt(i+ 1 )<= '9')){
                    sum += Integer.parseInt(num);
                    num= "";
                }
            }
        }
        System.out.println(sum);


        //Approach Two:
        String str1= "jav45ai1000sgre1at82" ;
        int sum1= 0 ; // 4 + 158
        String num1= ""; // 158
        for(int i= 0 ; i < str1.length(); i++) {
            if (Character.isDigit(str1.charAt(i))) {
                num1 += str1.charAt(i);
                if (i == str1.length()-1 || !Character.isDigit(str1.charAt(i+ 1 ))){
                    sum1 += Integer.parseInt(num1);
                    num1 = "";
                }
            }
        }
        System.out.println(sum1);



    }
}
