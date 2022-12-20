import java.util.Scanner;
class hello{
    public static void main(String arg[]){
        String name;
        System.out.println("Enter your name");
        Scanner input= new Scanner(System.in);
        name=input.next();
        System.out.println("hello "+name);
    }
}