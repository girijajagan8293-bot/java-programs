import java.util.*;
class Ifelseifeg2{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int a=sc.nextInt();
	if(a>0){
	System.out.println("It is positive.");
	}
	else if(a<0){
	System.out.println("It is negative.");
	}
	else {
	System.out.println("It is zero.");
	}
 }
}