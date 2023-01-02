// A program to implement Continue statement 
class  continue_stmt {
    public static void main(String arg[]){
        for(int i = 2; i < 10; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println("Result :  " + i);
        }

    }
}