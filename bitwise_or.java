// A java program to implement bitwise or operator
class bitwise_or{
    public static void main(String arg[]){
        int x = 0, y=0;
        if(x++ == 1 | y++ == 1){
            System.out.println("x " + x +" y "+y);
        }else{
            System.out.println("else part = x " + x + " y " + y);
        }
    }
}