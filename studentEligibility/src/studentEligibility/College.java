package studentEligibility;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Details:-");
		System.out.println("10th marks");
		int marks = scan.nextInt();
		
		Eligibility t1 = new Eligibility();
		t1.eligibility(marks);

		
	}

}
