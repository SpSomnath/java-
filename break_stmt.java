// A java program to implement break statement 
class break_stmt{
    public static void main(String arg[]){
        for(int i = 2; i<10; i++){
            if(i%3==0){
                break;
            }
            else{
                System.out.println("Result : " + i);
            }
        }
    }
}