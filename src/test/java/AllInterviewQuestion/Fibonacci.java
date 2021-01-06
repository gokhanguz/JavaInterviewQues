package AllInterviewQuestion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int n1,n2,n3;
        n1=0;
        n2=1;
        n3=0;
        for(int i=0;i<num;i++)
        {

            n3=n1+n2;
            n1=n2;
            n2=n3;


        }
        System.out.println(n1);

    }
}
