package calculator;

import java.util.Scanner;

/**
 * making calculator
 * this is the project of making calculator.
 * input data carefully according to your code
 * print all output
 * @author Sheum
 * @version 1
 * @since 29.10.2018
 */

public class CalculatoWithAnnotation {
	public static void main(String[] args) {
		int a,b,c;
		/**
		 * their creating an object to take input.
		 */
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c = addition(a,b);
		System.out.println(c);
		
		
	}
/**
 * this meathod for adding
 * @param x
 * @param y
 * @return x+y;
 */
	private static int addition(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
}
