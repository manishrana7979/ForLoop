package temperatureConverter;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temprature in Fahrenheit");
		double fahrenheit = scan.nextDouble();
		TemperatureConverter temp = new TemperatureConverter();
		double converter = temp.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(converter);
		
		

	}

	

}
