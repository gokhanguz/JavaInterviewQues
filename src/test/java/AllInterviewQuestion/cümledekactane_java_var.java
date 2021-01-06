package AllInterviewQuestion;

public class cümledekactane_java_var {
    public static void main(String[] args) {

     /**
          Write a program that will count how many times “java”is found in any given String:
     **/

    //Approach One:

        String givenStr = "Kac defa java geceiyok ki java sayisini javada say";
        int counter = 0 ;
        for (int i = 0 ; i<givenStr.length()-3 ; i++){

            if (givenStr.substring(i, i+ 4 ).equalsIgnoreCase("java"))
                counter++; }

        System.out.println(counter);


       // Approach Two:
        String str = "burada java yazdik ki Java kacta gesiyor bul ve java sayisini yazdir";
        int javaCounter= 0 ;
        str = str.toLowerCase(); //to be make the str case insensitive
        while(str.contains("java")){

            javaCounter++;
            str = str.replaceFirst("java","");
            //this will replace java with an empty string and return the remaining str.
        }
        System.out.println(javaCounter);
    }
}
