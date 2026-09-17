import java.util.*;
class Break{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
for(int i=1;i<=a;i++){
if(i%11==0){
break;
}
System.out.println(i);
}
}
}