import java.util.*;
class NestedIf1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your experience:");
int exp=sc.nextInt();
System.out.println("Enter your salary:");
int salary=sc.nextInt();
if(exp>=5){
if(salary<50000){
System.out.println("Eligible for 15% bonus");
}
else{
System.out.println("Eligible for 10% bonus");
}
}
else{
System.out.println("No bonus");
}
}
}