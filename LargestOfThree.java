import java.util.*;
class LargestOfThree{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
String large=(a>b && a>c)?"A is large":((b>a && b>c)?"B is large":"C is large");
String small=(a<b && a<c)?"A is small":((b<a && b<c)?"B is small":"C is small");
String same=(a==b||b==c)?"Three numbers is equal":"Three numbers is not equal";
System.out.println(large);
System.out.println(small);
System.out.println(same);
}
}