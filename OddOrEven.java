import java.util.*;
class OddOrEven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int a=sc.nextInt();
String b=(a%2==0)?"It is Even":"It is Odd";
System.out.println(b);
}}