package W3;
import java.util.Scanner;

/**
 * <h1>Soal 5 : Buka Tutup Jalan</h1>
 * Program Buka Tutup Jalan mengimplementasikan aplikasi untuk melakukan pengaturan jalan. 
 * Setiap empat mobil yang lewat digabung setiap angkanya. Jika (gabungan angka tersebut 
 * dikurangi 999999) hasilnya dibagi 5 sisa bagi hasilnya 0 maka 4 mobil tersebut harus 
 * berhenti, dan memperbolehkan mobil lainnya dari arah bersebrangan untuk jalan. Begitu 
 * terus sebaliknya.
 * 
 * Input format	: Satu baris berupa plat number untuk 4 mobil
 * Output format: Satu baris Berupa tulisan “Jalan” atau “Berhenti
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-19
 */

public class BukaTutupJalan {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			String mobil1 = input.next();						// Input plat number mobil 1
			String mobil2 = input.next();						// Input plat number mobil 2
			String mobil3 = input.next();						// Input plat number mobil 3
			String mobil4 = input.next();						// Input plat number mobil 4
			String numberInput = mobil1+mobil2+mobil3+mobil4;	// Gabungkan angka keempat lat number mobil
			long number = Long.parseLong(numberInput);			// Ubah tipe data plat number menjadi long integer
			if((number-999999)%5 == 0) {						// Cek apakah mobil harus jalan atau berhenti
				System.out.println("Jalan");					// Print "Jalan" jika mobil memenuhi syarat untuk jalan
			}else {
				System.out.println("Berhenti");					// Print "Berhenti" jika mobil memenuhi syarat untuk berhenti
			}
		}catch (Exception e) {
			System.out.println("something error");
		}
	}
}
