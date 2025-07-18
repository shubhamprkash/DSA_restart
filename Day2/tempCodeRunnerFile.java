import java.util.Scanner;

public class FactorialOfNos{
    public static void main(String[] args){
        // take N input
        // loop till 1 from N in decrease order
            //keep multiplying the result init from 1 till end of loop
        // print the result

        Scanner scan = new Scanner(System.in);

        long n;
        long result=1;
        System.out.print("Enter N: ");
        n=scan.nextLong();
        scan.close();

        for(long i = n; i>=1; i--){
            result *= i;
        }

        System.out.println("Factorial = " + result);

    }
}