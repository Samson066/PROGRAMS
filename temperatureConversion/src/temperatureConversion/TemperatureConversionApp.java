package temperatureConversion;
import java.util.Scanner;

public class TemperatureConversionApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!"); 
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int option= scan.nextInt();
		if (option==1) {
			System.out.println("Enter the temperature in Celsius:");
			double celsius=scan.nextDouble();
			double res=celsiusToFahrenheit(celsius);
			System.out.println(celsius +" degree C is equivalent to "+ res + "degree F"); 
		}
		 else if (option==2) {
			 System.out.println("Enter the temperature in Fahrenheit:");
			 double fahrenheit=scan.nextDouble();
				double res1= fahrenheitToCelsius(fahrenheit);
				System.out.println(fahrenheit +" degree F is equivalent to "+ res1 + "degree C");
			 
		 }
		 else {
			 System.out.println("Give the Valid option");
		 }
		scan.close();
	}

	public static double celsiusToFahrenheit(double celsius) {
	double Fahrenheit=(celsius *9/5) + 32;
    return Fahrenheit;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
	double Celsius=(fahrenheit - 32) * 5/9;
	return Celsius;
	}
}
