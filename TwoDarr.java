import java.util.*;
class TwoDarr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter row value:");
int r=sc.nextInt();
System.out.println("Enter column value:");
int c=sc.nextInt();
int[][] a=new int[r][c];
System.out.println("Enter the array elements:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=sc.nextInt();
}}
System.out.println("Array elements are:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(a[i][j]+" ");}
System.out.println("");}
}}