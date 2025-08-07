import java.util.*;

public class DigitSum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num,i,res = 0;
        
        System.out.print("Enter N: ");
        num=scan.nextInt();

        for(i=0;num>=1;i++){
            res += num%10;
            num=num/10;
        }

        System.out.println(res);

        // System.out.println(num.length());


    }
}