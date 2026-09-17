import java.util.*;
class Salary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the basic salary,HRA percent,DA percent,Tax percent: ");
int bs=sc.nextInt();
int hra=sc.nextInt();
int da=sc.nextInt();
int tax=sc.nextInt();
int HRA=bs*hra/100;
int DA=bs*da/100;
int GS=bs+HRA+DA;
int Tax=GS*tax/100;
int net=GS-Tax;
System.out.println("HRA :"+HRA);
System.out.println("DA :"+DA);
System.out.println("Gross Salary :"+GS);
System.out.println("Tax :"+Tax);
System.out.println("Total Salary :"+net);
}}