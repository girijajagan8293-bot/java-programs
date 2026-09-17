import java.util.*;
class ByteToChar{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	byte num=sc.nextByte();
	char b = (char) num;
        System.out.println("Byte value: " + num);
        System.out.println("Character: " + b);
    }
}