import java.util.Scanner;

public class OneToN{
    public static void main(String[] args){
        // print one to N
        // take user input
        // loop: print 1+ till N

        Scanner scan = new Scanner(System.in);
        int N;

        System.out.print("Enter N: ");
        N = scan.nextInt();

        // for(int i = 1;i<=N; i++){
        //     System.out.println(i);
        // }
        int i = 1;
        while(i<=N){
            System.out.println(i);
            i++;
        }

        scan.close();
    }
}