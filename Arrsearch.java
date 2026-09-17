import java.util.*;
class Arrsearch{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size:");
int n=sc.nextInt();
System.out.println("Enter the key element:");
int k=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter the array element:");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<n;i++){
System.out.println(a[i]+" ");
}
for(int i=0;i<n;i++){
if(k==a[i]){
System.out.println("Element found in array");
}else{
System.out.println("Element not found in array");
}}}}