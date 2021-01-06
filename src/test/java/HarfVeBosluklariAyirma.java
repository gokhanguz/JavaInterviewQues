
public class HarfVeBosluklariAyirma {
    public static void main(String[] args) {
        String str = "saaaaaaada   jlkl     sa djkslad";
        int count = 0;
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = i; j < str.length(); j++) {

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            if(str.charAt(i)==' '){
                if(str.charAt(i)==' ' && !(str.charAt(i+1) ==' ')){
                    str2 += str.charAt(i) + "";
                }else {
                    continue;
                }
            } else {
                str2 += str.charAt(i) + "" + count;
                i += count - 1;
            }
        }
        System.out.print(str2);

    }
}