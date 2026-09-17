import java.util.*;
class Online{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your purchase amount: ");
double amt=sc.nextInt();
System.out.println("Premium member?");
String pre=sc.next();
double disr;
if(amt<1000){
disr=0;
}
else if(amt>1000 && amt<=2999){
disr=5;}
else if(amt>=3000 && amt<=4999){
disr=10;
}
else if(amt>=5000 && amt<=9999){
disr=20;}
else{
disr=30;}
double dis=amt*disr/100;
double adis=amt=dis;
double predis=0;
if(pre.equalsIgnoreCase("yes")){
predis=adis*5/100;}
double famt=adis-predis;
double delivery;
if(famt>=5000){
delivery=0;}
else{
delivery=100;}
System.out.println("Discount: "+dis);
System.out.println("Premium Discount: "+predis);
if(delivery==0){
System.out.println("Delivery: Free");
}
else{
System.out.println("Delivery: "+delivery);}
famt=famt+delivery;
System.out.println("Final Amount: "+famt);
}}