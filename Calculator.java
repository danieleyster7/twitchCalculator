import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * for, while, do...while
		 */
		
		// Declare Variables
		int result = 0;
		boolean isValidOperation = true;
		boolean keepCalculating = true;
		int indexOfOperator = -1;
		char operator = ' ';
		int firstNum = 0;
		int secondNum = 0;
		
		System.out.println("Welcome to Pelotonia Calculator!!!1!");
		
		while(keepCalculating) {
			System.out.println("Enter an mathematical expression between 2 numbers or press Q to quit:");
			isValidOperation = true;
			
			String userInput = in.nextLine();
			if(userInput.contains("+")) {
				// Find where the operator is
				indexOfOperator = userInput.indexOf('+');
				// Pull out all the data
				firstNum = Integer.parseInt(userInput.substring(0, indexOfOperator));
				secondNum = Integer.parseInt(userInput.substring(indexOfOperator + 1, userInput.length()));
				result = firstNum + secondNum;
			}
			else if(userInput.contains("-")) {
				// Find where the operator is
				indexOfOperator = userInput.indexOf('-');
				// Pull out all the data
				firstNum = Integer.parseInt(userInput.substring(0, indexOfOperator));
				secondNum = Integer.parseInt(userInput.substring(indexOfOperator + 1, userInput.length()));
				result = firstNum - secondNum;
			}
			else if(userInput.contains("*")) {
				// Find where the operator is
				indexOfOperator = userInput.indexOf('*');
				// Pull out all the data
				firstNum = Integer.parseInt(userInput.substring(0, indexOfOperator));
				secondNum = Integer.parseInt(userInput.substring(indexOfOperator + 1, userInput.length()));
				result = firstNum * secondNum;	
			}
			else if(userInput.contains("/")) {
				// Find where the operator is
				indexOfOperator = userInput.indexOf('/');
				// Pull out all the data
				firstNum = Integer.parseInt(userInput.substring(0, indexOfOperator));
				secondNum = Integer.parseInt(userInput.substring(indexOfOperator + 1, userInput.length()));
				result = firstNum / secondNum;
			}
			else if(userInput.toLowerCase().contains("q")) {
				isValidOperation = false;
				keepCalculating = false;
			}
			else {
				isValidOperation = false;
				System.out.println("You didn't enter a valid operator, dummy!");
			}		
			
			if(isValidOperation){
				System.out.println("Result: " + result);
			}
		}
		System.out.println("Bye");
		in.close();
	}

}
