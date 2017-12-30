import java.util.Scanner;
/*
 * @author BikDS
 * October 17, 2017
 * This class is the driver class for Palindrome.java. It gives the user instructions
 * of how to use the program and tell the user if the input is a palindrome or not
 */
public class PalindromeTester {
	
	static Scanner keyboard = new Scanner(System.in);
	static boolean keepGoing;
	int position = 0;
	// the main method calls the run() method.
	public static void main(String[] args) {
		run();
	}
	/*
	 * the method run() prompts the user for a palindrome or has them quit the program by clicking q.
	 * If the user wants to check if their input is a palindrome or not, then the method will hand the input
	 * over to the class Palindrome.java, specifically to the isValid() method. 
	 */
	public static void run() {
		// this while loop continues as long as the user does not want to quit
		do {
			System.out.println("Enter a string to test if it is a palindrome or not. If you want"
					+ " to quit the program, enter the letter q");
			
			String input = keyboard.nextLine();
			// removes the whitespace from both sides of the input
			input = input.trim();
			
			// this if loop checks whether the user wants to quit the program
			if (input.equalsIgnoreCase("q")) {
				System.out.println("Have a good day!");
				keepGoing = false;
			}
			else {
				Palindrome pal = new Palindrome();
				if (pal.isValid(input) == true) {
					System.out.println(input + " is a palindrome.\n");
				}
				else if(pal.isValid(input) == false) {
					System.out.println(input + " is not a palindrome.\n");
				}
				keepGoing = true;
			}
		} while (keepGoing == true);
	}

}
