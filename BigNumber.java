package W3;
import java.util.Scanner;
import java.math.BigInteger;
/**
 * <h1>Soal 6 : Big Number</h1>
 * Big Number program implements an applicaton
 * to add and multiply huge numbers use the power of Java's BigInteger class.
 * 
 * Input format	: Two lines containing two numbers, a and b.
 * 				  a and b are non-negative integers and can have maximum 200 digits.
 * Output format: First line contain a+b, second line contain axb
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-19
 */
public class BigNumber{
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			BigInteger a = input.nextBigInteger();		// Input a
			BigInteger b = input.nextBigInteger();		// Input b
			System.out.println(a.add(b));				// Print a + b
			System.out.println(a.multiply(b));			// Print a x b
		}catch (Exception e) {
			System.out.println("something error");
		}
	}
}