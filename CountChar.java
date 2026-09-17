import java.util.*;
class CountChar{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
int count=0;
for(char ch:str.toCharArray()){
count++;
}
System.out.println("Number of characters:"+count);
}}