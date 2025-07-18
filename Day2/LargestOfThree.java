import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args){
        //take 3 nums user input optionally in array
        // check largest 
        // return largest of 3

        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter num 1: ");
        num1 = scan.nextInt();
        System.out.println("Enter num 2: ");
        num2 = scan.nextInt();
        System.out.println("Enter num 3: ");
        num3 = scan.nextInt();

        // logic
        if(num1 > num2 && num1 > num3){
            System.out.println("Num1 = " + num1 + " is largest");
        }
        else if(num2 > num3){
            System.out.println("Num2 = " + num2 + " is largest");
        }
        else{
            System.out.println("Num3 = " + num3 + " is largest");
        }

        scan.close();
    }
}