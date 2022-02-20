package W3;
import java.util.Scanner;
/**
 * <h1>Soal 2 : Input & Output(2)</h1>
 * Input & Output (2) program implements an applicaton
 * to print output with a format
 *
 * Input format	: Input a String followed by an integer
 * Output format: The first column contains the String and is left justified using exactly 15 characters.
 * 				  The second column he second column contains the integer, expressed in exactly 3 digits.
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-17
 */

public class InputOutput2 {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			int []number = new int[3];
			String[]word = new String[3];
			for(int i=0; i<3; i++) {			// Use loop to get 3 input
				word[i] = input.next();			// Input the string
				number[i] = input.nextInt();	// Input the integer
			}
			System.out.println("================================");
			for(int i=0; i<3; i++) {
				/* Use %-15s for let the String left justified using exactly 15 characters
				 * Use %03d for let the integer expressed in exactly 3 digits
				 */
				System.out.printf("%-15s%03d\n", word[i], number[i]);	
			}
			System.out.println("================================\n");
		}catch (Exception e) {
			System.out.println("something error");
		}
	}
}