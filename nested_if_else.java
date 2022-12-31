// A program of using nested_if_else
class nested_if_else{

    public static void main(String arg[]){
        int i = 2;
        if(i % 2 == 0){
            if(i % 1 == 0){
                System.out.println("Done");
            }
            else{
                System.out.println("Not Done");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}