/*
 * @author BikDS
 * October 17, 2017
 * This class checks whether the input from PalindromeTester is a palindrome or not. 
 */
public class Palindrome {
	/*
	 * The method isValid checks if the user entered input is valid(longer than 2 characters). 
	 * If it is valid, it is passed on to the method isPalindrome, and if not, it returns false.
	 */
	public boolean isValid(String input) {
		if (input.length() < 2) {
			return false;
		} else {
			return isPalindrome(input);
		}
	}

	/*
	 * the method isPalindrome() takes a the input from the isValid() method, and checks whether it meets the conditions
	 * of a palindrome. If the input meets the conditions, the method returns true, if not, it returns false.
	 */
	public boolean isPalindrome(String input) {
		String validInput = "";
		/* this loop removes any extraneous characters or spaces in the input and puts the rest of the characters
		* and places it into the string validInput
		*/
		for (int i = 0; i <= input.length() - 1; i++) {
			input = input.toLowerCase();
			char check = input.charAt(i);
			if ((check >= 'a' && check <= 'z') || (check >= '0' && check <= '9')) {
				validInput += check;
			}
		}
		// len is true if the length of validInput is greater than two, and false if not
		boolean len = true;
		// pal is whether the input is a palindrome or not
		boolean pal = true;

		/* this loops checks if the string validInput is longer than 1 character. If it isn't, the method will set boolean
		 * pal to false. 
		 * If validInput is longer than 1 character, it is passes onto the next while loop
		 */
		if (validInput.length() <= 1) {
			len = false;
			pal = false;
		}
		
		// start is the character position from which the palindrome checking starts at from the beginning of the input
		int start = 0;
		// end is the character position from which the palindrome checking starts at from the end of the input
		int end = validInput.length() - 1;
		/*
		 * this loop checks whether the string validInput is a palindrome or not. It starts with the first and last character,
		 * compares them, and then moves onto the next set of characters to compare. If it is a palindrome, the while loop 
		 * sets boolean pal to true. If not, it sets  pal to false
		 */
		while (start < end && len == true) {
			if (validInput.charAt(start) == validInput.charAt(end)) {
				pal = true;
				start++;
				end--;
			} else {
				pal = false;
				break;
			}
		}
		/*
		 * this if loop checks the value of pal, and returns true, if the input is palindrome. If not, it returns false.
		 */
		if (pal == true) {
			return true;
		} else {
			return false;
		}
	}

}
