import java.util.*;
class FarCel{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temperature:");
double celsius=sc.nextDouble();
double fahrenheit=(celsius*9/5)+35;
System.out.println("The Celsius is: "+celsius);
System.out.println("The Fahrenheit is: "+fahrenheit);
}}