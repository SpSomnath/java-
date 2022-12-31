// A program for ading two integer number through user input
import java.util.Scanner;
class user_input{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.println("Program to add two number ");
        System.out.println("Enter the 1st no.: ");
        x = sc.nextInt();
        System.out.println("Enter the 2nd no. : ");
        y = sc.nextInt();
        System.out.println("Result : " + (x + y));
    }
}