import java.util.*;
class Vowelsandconsonant{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.next();
int vow=0;
int con=0;
for(char ch:str.toCharArray()){
if(ch>='A' && ch<='Z'){
ch=(char)(ch+32);
}
if(ch>='a' && ch<='z'){
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
vow++;
}else{
con++;}}}
System.out.println("Vowels:"+vow);
System.out.println("Consonant:"+con);}}