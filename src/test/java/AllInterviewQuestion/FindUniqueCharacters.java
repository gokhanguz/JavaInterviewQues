package AllInterviewQuestion;

public class FindUniqueCharacters {
    public static void main(String[] args) {
        /**
         * Write a return method that can find the unique characters from the String
         * Ex: unique("AAABBBCCCDEF") ==> "DEF";
         */


        //Approach One:
        String str= "AAABBBCCCDEF";
        String result = "";
        for (int i = 0 ; i <str.length(); i++) {
            if (str.contains(""+str.charAt(i))){
                str=str.replaceAll(""+str.charAt(i),"");
            }
        }
        System.out.println(str);


 /*
        Approach Two:
        String str= "AAABBBCCCDEF";
        String result = "";
        for(String each : str.split(""))
            result +=( (Collections.frequency(Arrays.asList(str.split("")), each)) == 1 )? each : "";
        System.out.println(result);
*/

/*

		//remove duplicate
		//first way
		String [] sentence= {"a","a","b","b","c"};
		Set<String> remdup =new TreeSet<>(Arrays.asList(sentence));
		System.out.println(remdup);

		//second way
		String str="AAABBBCCCEE";
		String[] word=str.split("");
		Set<String> remdup1 =new TreeSet<>(Arrays.asList(word));
		System.out.println(remdup1);

		//third way

		String str2="AAABBBCCCDDEE";
		String space="";
		for(int i=0;i<str2.length()-1;i++) {

			if(!space.contains(str2.substring(i,i+1))) {

				space+=str2.substring(i,i+1);
			}
			System.out.println(space);
		}

 */

    }
}
