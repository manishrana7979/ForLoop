package theDoubleTrouble;
import java.util.*;
public class Double {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a no.");
		int num = input.nextInt();
		System.out.println(doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
