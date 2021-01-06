package AllInterviewQuestion;

public class palindrome_word {
    public static void main(String[] args) {
        /**
         * Given any String determine if itis Palindrome. Print“Palindrome”if itis and “Not Palindrome”if
          it is not:
         */

        //Approach One:
        String text = "amalama";
        boolean check = true;
        for (int i= 0 ; i<text.length()/2 ; i++){
            if (text.charAt(i) != text.charAt(text.length()-1 -i)){
                check= false;
                break; }
        }
        System.out.println(check ? "Palindrome" : "Not Palindrome");

        //Approach Two:
        String str1 = "deneme";
        String str2 = "";
        for (int i= str1.length()-1 ; i>= 0 ;i--)
            str2 += str1.charAt(i);
        if (str1.equalsIgnoreCase(str2))
            System.out.println(str1 + " is a palindrome" + " Here is the reversed = " + str2);
        else
            System.out.println(str1 + " is NOT a palindrome!"+ " Here is the reversed = " + str2);


       // Approach Three:
        String str3 = "deneme";
        String str4 = new StringBuffer(str1).reverse().toString();
        System.out.println(str4);

        //Approach Four:
        String name="top spot";
        String newWord="";
        for(int i=name.length();i>0;i--) {
            newWord=newWord+name.substring(i-1, i);
            // newWord=newWord+name.charAt(i);-->	(int i=name.length()-1;i>=0;i--)
        }
        if(name.replace(" ","").equalsIgnoreCase(newWord.replace(" ", ""))) {
            System.out.println("true");
        }else {
            System.out.println(false);
        }


    }
}
