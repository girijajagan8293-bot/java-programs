import java.util.*;
class Time{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the seconds: ");
int a=sc.nextInt();
int totalMinutes = a / 60;
int seconds = a % 60;
int hours = totalMinutes / 60;
int minutes = totalMinutes % 60;
System.out.println("Hours: "+hours);
System.out.println("Minutes: "+minutes);
System.out.println("Seconds: "+seconds);
System.out.println(hours+":"+minutes+":"+seconds);
}}