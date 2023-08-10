package temperatureConverter;

public class TemperatureConverter {
	public static double convertFahrenheitToCelsius(double fahrenheit) {
		double c = (fahrenheit - 32) * 5/9;
		return c;
	}
}

