import java.util.*;

public class Add {

	public static void main(String[] args) {
		
		System.out.println("Enter two nos  ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int sum = a^b;
		int carry = (a&b)<<1;
		int addition = sum^carry;
		System.out.println("Addition of two nos using Arithmatic operators = " + (a+b));
		System.out.println("Addition of two nos without using Arithmatic operators = " + addition );
		}

}
