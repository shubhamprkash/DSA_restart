import java.util.*;

public class DigitCount{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num,i;
        
        System.out.print("Enter N: ");
        num=scan.nextInt();

        for(i=0;num>=1;i++){
            num = num/10;
        }

        System.out.println(i);

        // System.out.println(num.length());


    }
}