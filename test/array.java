import java.util.Scanner;
class A {
	
	public static void main(String[] args) {
	  int arr[]=new int[10];
	  int i;
	  Scanner in= new Scanner(System.in);
	  System.out.println("enter the element f array:");
	  for(i=0;i<arr.length;i++){
		  arr[i]=in.nextInt();
		}
	  System.out.println("the element of array:");
	  for (i=0;i<arr.length;i++){
		System.out.print(arr[i]+"\t");
	  }
	}
  }