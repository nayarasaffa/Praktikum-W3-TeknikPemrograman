package W3;

import java.util.Scanner;

/**
 * <h1>Soal 1 : Input & Output</h1>
 * Input & Output program implements an applicaton
 * to split the string into tokens. The token define
 * to be one or more consecutive English alphabetic letters.
 * 
 * Input format: a single string s composed of English alphabetic letters, blank spaces,
 * 				 "!", ",", "?", ".", "_", "'", and "@"
 * Output format: On the first line, there's an integer denoting the number of tokens in string s
 * 				  On the next line, there's each of the n tokens on a new line 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-17
 */

public class InputOutput {
	
	/**
	 * This is the main method.
	 * Here's where the string is 
	 * split into tokens.
	 */
	
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {
            String s = input.nextLine();					// Input the string
            String[] n = s.split("[  ! , ? . _ ' @]+");		// Split the string into tokens
            System.out.println(n.length);					// Denoting number of tokens
            for(int i=0; i<n.length; i++) {
            	System.out.println(n[i]);					// print each of the n tokens on a new line
            }
        } catch (Exception e) {
            System.out.println("something error");
        }
	}
}