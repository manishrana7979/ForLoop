package arithmeticOperations;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two no.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(subtractNumbers(num1, num2));
		System.out.println(multiplyNumbers(num1, num2));
		System.out.println(divideNumbers(num1, num2));
		System.out.println(findRemainder(num1, num2));
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num2-num1;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}


}
