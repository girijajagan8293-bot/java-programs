import java.util.*;
class Menu{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("1.Burgger-Rs.120");
System.out.println("2.Pizza-Rs.250");
System.out.println("3.Pasta-Rs.180");
System.out.println("4.Sandwich-Rs.100");
int choice=sc.nextInt();
int qnt=sc.nextInt();
System.out.println("Choice= "+choice);
System.out.println("Quantity= "+qnt);
int price=0;
switch(choice){
case 1:
price=120;
break;
case 2:
price=250;
break;
case 3:
price=180;
break;
case 4:
price=100;
break;
default:
System.out.println("Invalid choice");
}
int subtotal=price*qnt;
double discount=0;
double bill;
if(subtotal>1000){
double dis=subtotal*10/100.0;
System.out.println("Discount= "+discount);
}
bill=subtotal-discount;
System.out.println("Final Bill= "+bill);
}
}