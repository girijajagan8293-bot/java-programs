import java.util.*;
class AvgMark{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a1=sc.nextInt();
int a2=sc.nextInt();
int a3=sc.nextInt();
int a4=sc.nextInt();
int a5=sc.nextInt();
int total=a1+a2+a3+a4+a5;
float avg=total/5.0f;
float percent=(total/500.0f)*100;
System.out.println("Total marks: "+total);
System.out.println("Average marks: "+avg);
System.out.println("Percentage : "+percent);
}
}
