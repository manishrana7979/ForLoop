package gGalacticArithmetic;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two no.");
		long num1 = in.nextLong();
		long num2 = in.nextLong();
		System.out.println(galacticAddition(num1,num2));
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}
}
