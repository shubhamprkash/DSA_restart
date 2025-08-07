import java.util.*;

public class PrimeCheck{
    public static void main(String [] args){
        // take userinput n
        // check prime
            // loop from 2 to sqrRoot(n)
            // if % of n is 0 in all iteration 
                // then prime
                // else composite
        
        Scanner scan = new Scanner(System.in);
        int n,srt_n;
        boolean primeFlag = true;
        int count = 0;

        System.out.print("Enter N: ");
        n=scan.nextInt();
        srt_n =(int) Math.sqrt(n);

        for(int i = 2; i<=srt_n; i++){
            count++;
            if(n%i==0){
              primeFlag = false;
              break;
            }
        }
        System.out.println(count);
        if(primeFlag && n> 1){
            System.out.println(n + " is a Prime number");
        }
        else{
            System.out.println(n + " is not a Prime number");
        }
    }
}