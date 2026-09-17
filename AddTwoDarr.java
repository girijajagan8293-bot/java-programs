import java.util.*;
class AddTwoDarr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row size:");
int r=sc.nextInt();
System.out.println("Enter the column size:");
int c=sc.nextInt();
int[][] a=new int[r][c];
int[][] b=new int[r][c];
int[][] sum=new int[r][c];
System.out.println("Enter the first array elements:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=sc.nextInt();
}}
System.out.println("First array element:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(a[i][j]+" ");
}
System.out.println(" ");}
System.out.println("Enter the second array elements:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
b[i][j]=sc.nextInt();
}}
System.out.println("Second array element:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(b[i][j]+" ");
}
System.out.println(" ");}
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
sum[i][j]=a[i][j]+b[i][j];
}}
System.out.println("Sum of two arrays:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(sum[i][j]+" ");}
System.out.println("");}
}}