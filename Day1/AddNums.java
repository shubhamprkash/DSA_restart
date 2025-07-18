import java.util.Scanner;

public class AddNums{
    public static void main(String[] args){
        // Enter first number: 4  
        // Enter second number: 7

        int num1, num2, sum;
        Scanner scan = new Scanner(System.in);

        System.out.print("Emter first number: ");
        num1 = scan.nextInt();
        System.out.print("Emter second number: ");
        num2 = scan.nextInt();

        //logic
        sum=num1+num2;
    //output
        System.out.println("Sum = "+sum);
        
        scan.close();



    }
}