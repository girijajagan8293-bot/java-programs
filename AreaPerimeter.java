import java.util.*;
class AreaPerimeter{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lenght and breadth:");
int length=sc.nextInt();
int breadth=sc.nextInt();
int area=length*breadth;
System.out.println("Area of Rectangle: "+area);
int perimeter=(2*(length+breadth));
System.out.println("Perimeter of Rectangle: "+perimeter);
String result=(length==breadth)?"It is a Square":"It is not a Square";
System.out.println(result);}
}