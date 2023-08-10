package theStringJoiner;
import java.util.*;
public class StringJoiner {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first name");
	String str1 = input.nextLine();
	System.out.println("Enter last name");
	String str2 = input.nextLine();
	System.out.println(joinStrings(str1,str2));
	
	
}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
}
