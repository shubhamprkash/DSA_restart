import java.util.Scanner;

public class sumFirstNaturalNos{
    public static void main(String[] args){
        //take user input N
        //add all nos from 1 to N
        // print the final sum
        Scanner scan = new Scanner(System.in);
        int n;
        int sum=0;
        System.out.print("Enter N: ");
        n=scan.nextInt();
        scan.close();

        for(int i = 1; i<=n; i++){
            // System.out.println(i);
            sum+= i;
        }
        System.out.println("Sum = "+sum);
    }
}