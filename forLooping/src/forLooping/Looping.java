package forLooping;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.println("Looping System");
		System.out.println("Enter any no.");
		int num = scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}

	}

}
