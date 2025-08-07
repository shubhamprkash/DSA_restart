import java.util.*;

public class RevertInteger{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num,i,rev = 0;
        
        System.out.print("Enter N: ");
        num=scan.nextInt();

        for(i=0;num>=1;i++){
            rev=rev*10+( num % 10);
            num=num/10;
        }

        System.out.println(rev);

        // System.out.println(num.length());


    }
}