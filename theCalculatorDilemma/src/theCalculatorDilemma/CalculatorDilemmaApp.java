package theCalculatorDilemma;
import java.util.Scanner;

public class CalculatorDilemmaApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any two numbers to perform arithmetic operations"); 
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Enter 1 for executing addition operation");  
		System.out.println("Enter 2 for executing subtracton operation");
		System.out.println("Enter 3 for executing multiplication operation");
		System.out.println("Enter 4 for executing division operation");
		int num = scan.nextInt();
		scan.close();
		
		switch(num)
		{
		case 1:System.out.println("Result for Subtraction"+ " "+(a+b));
				break;
		case 2:System.out.println("Result for Addition is" +" "+(a-b));
				break;
		case 3:System.out.println("Result for Multiplication is"+" "+ (a*b));
				break;
		case 4:System.out.println("Result for Division is "+" "+ (a/b));
				break;
		default:System.out.println("Enter the value properly "); 
		}
	}
}
			
