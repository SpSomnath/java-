// A program to implement if_else_if 
class if_else_if{
    public static void main(String arg[]){
        int i = 10;
        if(i % 3 == 0 ){
            System.out.println("Result: "+(i));
        }
        else if(i % 6 == 0){
            System.out.println("Result: "+(i));
        }
        else if(i % 5 == 0){
            System.out.println("Result: "+(i));
        }
        else{
            System.out.println("Not found");
        }
    }
}