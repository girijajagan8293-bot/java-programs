import java.util.*;
class Countoddeven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int odd=0,even=0;
for(int i=0;i<=a;i++){
if(a%2==0){
System.out.println("Even");
even++;
System.out.println(even);
}
else{
System.out.println("Odd");
odd++;
}}
}}