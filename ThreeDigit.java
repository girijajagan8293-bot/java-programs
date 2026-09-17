import java.util.*;
class ThreeDigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Three digit number: ");
int n=sc.nextInt();
int h=n/100;
int t=(n/10)%10;
int o=n%10;
int sd=h+t+n;
int pd=h*t*n;
System.out.println("Hundreds:"+h);
System.out.println("Tens:"+t);
System.out.println("Ones:"+o);
System.out.println("Sum of the digits: "+sd);
System.out.println("Product of the digits: "+pd);
}}