package AllInterviewQuestion;

public class BinaryGap {


    public static void main(String[] args) {

  /**    9 ---->1001
      9/2--> kalan 1
      4/2---> kalan 0
       2/2--> kalan 0
        1/2---> kalan 1
   */
        int N=1041;
//        String str="";
//        while(N>=2){
//
//         str+=N%2;
//         N=N/2;
//        }
//        str+=N;
//        StringBuffer str1=new StringBuffer(str);
//        str1.reverse();
//        System.out.println("str1 = " + str1);
//       // String str2=Integer.toBinaryString(44);
//       // System.out.println("str2 = " + str2);
//
//        int count=0;
//        int count2=0;
//        for (int i=0;i<str1.length();i++){
//
//            if (str1.charAt(i)=='0'){
//                count++;
//            }
//
//        }
      System.out.println(solution(N));
    }
    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println("binary = " + binary);
        int count = 0;
        int tmpCount = 0;
        for (int i = 0; i < binary.length()-1; i++) {
            if (binary.charAt(i) == '0') {
                if (i > 0 && binary.charAt(i - 1) == '1') {
                    tmpCount++;
                } else {
                    if (tmpCount > 0) tmpCount++;
                }
            } else if (binary.charAt(i) == '1') {
                if (tmpCount > 0 && tmpCount > count) {
                    count = tmpCount;
                }
                tmpCount = 0;
            }
        }
        return count;
    }




}
