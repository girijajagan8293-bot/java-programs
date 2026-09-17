import java.util.*;
class IntToByte {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
        byte b = (byte) num;
        System.out.println("Integer value: " + num);
        System.out.println("Byte value: " + b);
    }
}