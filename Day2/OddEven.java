import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        // take user inpu for number to check
        // check if number is multiple of 2.
        // return even or odd as output

        Scanner scan = new Scanner(System.in);
        int userInput;

        System.out.print("Enter the num: ");
        userInput = scan.nextInt();

        // logic
        if(userInput % 2 == 0){
            System.out.print(userInput+" is Even");
        }
        else{
            System.out.print(userInput+" is Odd");
        }
    }
}