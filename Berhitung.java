package W3;

import java.util.Scanner;

/**
 * <h1>Soal 3 : Berhitung</h1>
 * Program Berhitung mengimplementasikan aplikasi untuk melakukan 
 * operasi matematika (penjumlahan, pengurangan, perkalian, pembagian, sisa hasil bagi)
 *
 * Input format	: Satu baris berisi A, operator, dan B, masing-masing dipisahkan sebuah spasi,
 * 				  yang menyatakan terdapat operasi "A operator B"
 * Output format: Satu baris berisi sebuah bilangan bulat, hasil "A operator B"
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-17
 */

public class Berhitung {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			int result = 0;
			int A = input.nextInt();			// Input integer A
			String operator = input.next();		// Input operator matematika
			int B = input.nextInt();			// Input integer B
			/*
			 * Cocokkan input dengan salah satu operator matematika 
			 * dan lakukan operasi perhitungan.
			 */
			switch (operator) {
			case("+"):
				result = A+B;
				break;
			case("-"):
				result = A-B;
				break;
			case("*"):
				result = A*B;
				break;
			case("/"):
				result = A/B;
				break;
			case("%"):
				result = A%B;
				break;
			}
			System.out.printf("%d", result);	// Tampilkan hasil perhitungan ke layar
		}catch (Exception e) {
			System.out.println("something error");
		}
	}
}
