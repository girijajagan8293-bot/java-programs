import java.util.*;
class ThreeDigitNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a threedigit integer: ");       
int num = sc.nextInt();
int n = Math.abs(num);
int first = n / 100;
int middle = (n / 10) % 10;
int last = n % 10;
boolean positive = num > 0;
boolean even = num % 2 == 0;
boolean firstGreater = first > last;
boolean sumDivisibleBy3 = (first + last) % 3 == 0;
boolean divisibleBy3And5 = num % 3 == 0 && num % 5 == 0;
boolean allDifferent = first != middle && middle != last && first != last;
System.out.println("Positive: " + positive);
System.out.println("Even: " + even);
System.out.println("First digit greater than last digit: " + firstGreater);
System.out.println("Sum of first and last digits divisible by 3: " + sumDivisibleBy3);
System.out.println("Divisible by both 3 and 5: " + divisibleBy3And5);
System.out.println("All three digits are different: " + allDifferent);
    }
}