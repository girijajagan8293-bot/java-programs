import java.util.*;
class MobileData{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter data usage in GB: ");
double gb=sc.nextDouble();
double bill;
if(gb<=1){
bill=100;}
else  if(gb<=5){
bill=100+(gb-1)*40;
}
else if(gb<=10){
bill=260+(gb-5)*30;}
else{
bill=410*(gb-10)*20;}
System.out.println("Bill:"+bill);
if(gb>15){
System.out.println("Heavy Data Usage");}
}}