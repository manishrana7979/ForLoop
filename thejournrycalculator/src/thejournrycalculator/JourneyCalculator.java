package thejournrycalculator;

public class JourneyCalculator {
	public static void main(String[] args) {
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		//journeyCalculator.calculateDistance();
		
		System.out.println(journeyCalculator.calculateDistance());
	}
	

public double calculateDistance(double speed, double time) {
	return speed*time;

}
