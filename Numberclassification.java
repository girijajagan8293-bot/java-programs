import java.util.*;
class Numberclassification{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
if(a>0){
System.out.println("Positive");
if(a%2==0){
System.out.println("Even");}
else{
System.out.println("Odd");}
}
else if(a<0){
System.out.println("Negative");
if(Math.abs(a)%2==0){
System.out.println("Even");}
else{
System.out.println("Odd");}
}
else{
System.out.println("Zero");}
}}