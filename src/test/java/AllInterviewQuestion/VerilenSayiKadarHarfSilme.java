package AllInterviewQuestion;

public class VerilenSayiKadarHarfSilme {
    /**
     *
     */

    public static void main(String[] args) {
        String str = "aaba kouq bux";
        int num=2;
        returnword(str,num);

    }

    public static String returnword(String str,int count){

        int letterCounter = 0 ;
        str = str.toLowerCase();
        String usedLetters= "";
        for (int i= 0 ; i<str.length();i++){
            letterCounter= 0 ;
            if (usedLetters.contains(str.charAt(i)+ ""))
                continue;
            // if we used the letter before it will skip this iterator/loop
            for (int j= 0 ; j<str.length();j++ ){
                if (str.charAt(i)==str.charAt(j)){
                    letterCounter++;
                }
            }

            if(!(letterCounter ==count)){
                System.out.print(str.charAt(i));
                usedLetters +=str.charAt(i);

            }
           // System.out.println(str.charAt(i)+ " = " + letterCounter);
           // usedLetters +=str.charAt(i);

            // creating a new string from the letters coming out of the loop so
            // we don't count them again and have the unique letters only
        }



        return str="";
    }
}
