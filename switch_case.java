// A program to implement swich case
class switch_case{
    public static void main(String arg[]){
        int ch = 3;
        
        switch(ch){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            default :{
                System.out.println("Invalid choose");
            }
        }
    }
}