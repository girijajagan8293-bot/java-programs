import java.util.*;
class Electricity{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter units:");
int u=sc.nextInt();
double bill;
if(u<=100){
bill=u*2;}
else if(u<=200){
bill=(100*2)+((u-100)*3);}
else if(u<=400){
bill=(100*2)+(100*3)+((u-200)*5);}
else{
bill=(100*2)+(100*3)+(200*5)+((u-400)*7);}
bill=bill+50;
System.out.println("Electricity Bill: "+bill);
}}