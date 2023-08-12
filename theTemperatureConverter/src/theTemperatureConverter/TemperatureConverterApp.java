package theTemperatureConverter;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the fahrenheit value"); 
		double fahrenheit= scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double celsuis = temperatureConverter.convertFarenheitToCelsius(fahrenheit);
		System.out.println(celsuis);
		
	}

}
