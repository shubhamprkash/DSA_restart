import java.util.Scanner;

public class ReverseNtoOne{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter N: ");
        n=scan.nextInt();
        // for(int i=n;i>=1;i--){
        //     System.out.println(i);
        // }
        int i=n;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}