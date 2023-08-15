package logicalOperatorValidator;
import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		boolean valid= scan.nextBoolean();
		System.out.println("Is input valid (true/false):"+valid);
		boolean condition= scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):"+condition);
		boolean res= isValidInput(valid,condition);
		scan.close();
		if(res==true) {
			System.out.println("Input is valid.");
		}
		else 
				System.out.println("Input is invalid.");
			
		}
	public static boolean isValidInput (boolean valid,boolean condition) {
		return(valid||condition);
	}
}
