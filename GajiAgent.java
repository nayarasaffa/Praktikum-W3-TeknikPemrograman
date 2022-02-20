package W3;

import java.util.Scanner;

/**
 * <h1>Soal 4 : Gaji Agent</h1>
 * Program Gaji Agent mengimplementasikan aplikasi untuk melakukan 
 * perhitungan gaji sebuah agent penjualan.
 * 
 * Input format	: Satu baris integer berupa jumlah penjualan bulan ini
 * Output format: Satu baris berisi sebuah bilangan berupa gaji yang diterima
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-19
 */

public class GajiAgent {
	
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			double bonus = 0, gaji = 500000;
			int jumlahPenjualan = input.nextInt();		// Input jumlah penjualan
			// Hitung jumlah gaji karyawan yang jumlah penjualannya dibawah 15
			if(jumlahPenjualan < 15) {
				gaji = gaji-(0.15*(15-jumlahPenjualan)*50000);
			}
			// Hitung jumlah gaji karyawan yang jumlah penjualannya minimal 15
			if(jumlahPenjualan >= 15 && jumlahPenjualan < 40 && jumlahPenjualan < 80) {
				bonus = 0.1*50000*jumlahPenjualan;
				gaji = gaji+bonus;
			}
			// Hitung jumlah gaji karyawan yang jumlah penjualannya minimal 40
			if(jumlahPenjualan >= 40 && jumlahPenjualan < 80) {
				bonus = 0.25*50000*jumlahPenjualan;
				gaji = gaji+bonus;
			}
			// Hitung jumlah gaji karyawan yang jumlah penjualannya minimal 80
			if(jumlahPenjualan >= 80) {
				bonus = 0.35*50000*jumlahPenjualan;
				gaji = gaji+bonus;
			}
			System.out.printf("%.0f", gaji);			// Print jumlah gaji karyawan
		}catch (Exception e) {
			System.out.println("something error");
		}
	}
}
