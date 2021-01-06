package AllInterviewQuestion;

public class HarfCikarma {
    public static void main(String[] args) {


        String str="aaaba      kou       q bux";
        int num=3;
        String dummy="";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
           if (str.charAt(i)==' '){
               if (!(str.charAt(i+1) ==' ')){
                   dummy+=" ";
               }else{
                   continue;
               }
           }
            if (!(count>=num)){

                dummy+= str.charAt(i);
            }

        }
        dummy=dummy.trim();
        System.out.println("dummy =" + dummy);

    }

}
