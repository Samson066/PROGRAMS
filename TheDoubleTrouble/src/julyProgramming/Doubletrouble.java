package julyProgramming;
import java.util.Scanner;

public class Doubletrouble {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the value");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num)); 
		

	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
