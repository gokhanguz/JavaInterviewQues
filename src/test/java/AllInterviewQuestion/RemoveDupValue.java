package AllInterviewQuestion;

public class RemoveDupValue {

    public static void main(String[] args) {
        /**
         * Write a return method that can remove the duplicate values from String
         * Ex: removeDup("AAABBBCCC") ==> ABC
         */

        //Approach One:
        String str= "AAABBBCCC";
        String result = "";
        for (int i = 0 ; i <str.length() ; i++) {
            for (int j = 0 ; j <str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j)){
                    result += str.charAt(i);
                    str = str.replaceAll(""+str.charAt(i),"");
                }
            }
            System.out.println(result);
        }

/*
        Approach Two:
        String str= "AAABBBCCC";
        String result = "";
        for (int i = 0 ; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
        System.out.println(result);

*/

        /*
        String str = "AAABBKKACCDDDWWWBDD";

		String[] str1=str.split("");

		Set<String> rem=new TreeSet<String>(Arrays.asList(str1));
		System.out.println(rem.toString());

		String str3="";

		for(int i=0;i<str.length();i++) {

			if(!str3.contains(str.substring(i,i+1))) {

				str3+=str.substring(i,i+1);
			}
		}
		System.out.println(str3);

         */
    }
}
