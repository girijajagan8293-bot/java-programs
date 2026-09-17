import java.util.*;
class SimpleInterest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principal amount, rate of interest,time:"); 
int pa=sc.nextInt();
int r=sc.nextInt();
int time=sc.nextInt();
int si=(pa*r*time)/100;
int ta=pa+si;
System.out.println("Simple interest: "+si);
System.out.println("Total amount: "+ta);
}}