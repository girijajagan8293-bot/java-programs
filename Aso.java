import java.util.*;
class Aso{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Assigment Addition is: "+(a+=5));
System.out.println("Assigment Subtraction is: "+(a-=5));
System.out.println("Assigment Multiplication is: "+(b*=5));
System.out.println("Assigment Division is: "+(a/=10));
System.out.println("Assigment Modulo is: "+(b%=5));
}
}