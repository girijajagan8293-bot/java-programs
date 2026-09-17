import java.util.*;
class Railway{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("1.Book Ticket");
System.out.println("2.Cancel Ticket");
System.out.println("3.Check Ticket Price");
System.out.println("4.Check Train Status");
System.out.println("5.Exit");
System.out.println("Enter your choice: ");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("Enter passenger name: ");
String name=sc.next();
System.out.println("Enter age: ");
int age=sc.nextInt();
System.out.println("Enter number of tickets: ");
int num=sc.nextInt();
double price=500;
double total;
if(age<12){
price=price-(price*50/100);}
else if(age>=60){
price=price-(price*30/100);}
total=price*num;
System.out.println("Ticket Booked successfully!");
System.out.println("Total amount: "+total);
break;
case 2:
System.out.println("Ticket cancelled successfully!");
break;
case 3:
System.out.println("Basic ticket price: Rs.500");
break;
case 4:
System.out.println("Train is on time");
break;
default:
System.out.println("Invalid choice");}
}}