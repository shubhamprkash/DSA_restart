import java.util.Scanner;

public class AreaOfrectangle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //take length and width input
        //find area
        //return output

        double len, width, area;

        System.out.print("Enter length: ");
        len = scan.nextDouble();
        System.out.print("Enter width: ");
        width = scan.nextDouble();

        //logic
        area =len*width;

        System.out.println("Area : " + area);

        scan.close();

    }
}