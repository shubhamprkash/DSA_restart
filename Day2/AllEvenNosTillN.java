import java.util.Scanner;

public class AllEvenNosTillN{
    public static void main(String[] args){
        // take N as input
        // loop till N
            //check if i is even then print.

        Scanner scan = new Scanner(System.in);

        int N;
        System.out.print("Enter N: ");
        N = scan.nextInt();
        scan.close();

        // for(int i=1; i<=N; i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // } 
        int i=1;
        while( i<=N){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        } 


    }
}