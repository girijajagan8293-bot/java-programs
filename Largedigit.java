import java.util.*;
class Largedigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
int large=0;
int digit=0;
while(n>0){
digit=n%10;
if(digit>large){
large=digit;
}
n=n/10;}
System.out.println("The largest digit is "+large);
}}