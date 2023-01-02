//A java program to implement bitwise and operator
class bitwise_and{
    public static void main(String arg[]){
        int x = 0, y = 0;
        if(x++ == 1 & y++ == 1){
            System.out.println("x "+ x + " y = "+ y);
        }
        else{
            System.out.println("else part x = "+ x + " y = "+ y);
        }
    }
}
