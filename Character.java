import java.util.*;
class Character{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z'){
System.out.println("UpperCase Alphabet");
if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U'){
System.out.println("Vowel");}
else{
System.out.println("Consonant");}}
else if(ch>='a' && ch<='z'){
System.out.println("Lowercase Alphabet");
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println("Vowel");}
else{
System.out.println("Consonant");}
}
else if(ch>='0' && ch=='9'){
System.out.println("Digit");}
else{
System.out.println("Special character");}}}