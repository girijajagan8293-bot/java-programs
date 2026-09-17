import java.util.*;
class Switchcaseeg1{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter A value:");
int a=sc.nextInt();
System.out.println("Enter B value:");
int b=sc.nextInt();
System.out.println("Enter the operation perform arithmetic operations");
String op=sc.next();
switch(op){
case "+":
System.out.println("Add: "+(a+b));
break;
case "-":
System.out.println("Sub: "+(a-b));
break;
case "*":
System.out.println("Mul: "+(a*b));
break;
case "/":
System.out.println("Div: "+(a/b));
break;
case "%":
System.out.println("Mod: "+(a%b));
break;
default:
System.out.println("Invalid operators");
}
}
}