import java.util.Scanner;

public class SumEvenTillN{
    public static void main(String[] args){
        // take n as input
        // loopfrom 1 to N
            // check even && add to result
            // or loop in 2 stepps only for even
        //print result

        Scanner scan = new Scanner(System.in);

        int n;
        int result = 0;

        System.out.print("Enter N: ");
        n=scan.nextInt();
        scan.close();

        // for(int i=1; i<=n; i++){
        //     if(i%2==0){
        //         result += i;
        //     }
             
        // }
        for(int i=2; i<=n; i+=2){
                result += i; 
        }
        System.out.println(" Sum of Even nos = "+ result);

    }
}