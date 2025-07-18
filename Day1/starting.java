import java.util.Scanner;

public class starting{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1, num2, temp;
        System.out.println("Enter first number:");
        num1 = scan.nextInt();
        System.out.println("Enter second number:");
        num2 = scan.nextInt();
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // swapping logic

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After swapping: num1= "+num1+ " & num2 = "+num2);
        

    }
}