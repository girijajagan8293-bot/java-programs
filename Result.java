import java.util.*;
class Result{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your five subject marks : ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
int total=a+b+c+d+e;
double avg=total/5;
System.out.println("Total= "+total);
System.out.println("Average= "+avg);
if(a<35 || b<35 || c<35 || d<35 || e<35){
System.out.println("Result= Fail");}
else{
System.out.println("Result= Pass");
if(avg>=90 && avg<=100){
System.out.println("Grade=A+");}
else if(avg>=80 && avg<=89){
System.out.println("Grade=A");}
else if(avg>=70 && avg<= 79){
System.out.println("Grade=B");}
else if(avg>=60 && avg<=69){
System.out.println("Grade=C");}
else if(avg>=50 && avg<=59){
System.out.println("Grade=D");}
else{
System.out.println("Grade=E");}
}
}
}