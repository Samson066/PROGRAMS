package taxCalculator;
import java.util.Scanner;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double Amount= scan.nextDouble();
		System.out.println("Enter the purchase amount:"+ Amount);
		double tax= scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):"+ tax); 
		double totalCost=calculateTotalWithTax(Amount,tax);
		System.out.println("Total cost including tax:"+ totalCost); 
		scan.close();
	}
	public static double calculateTotalWithTax(double PurchaseAmount,double TaxRate) {
		double totalCost= PurchaseAmount*TaxRate;
		return totalCost;
	}
	
}