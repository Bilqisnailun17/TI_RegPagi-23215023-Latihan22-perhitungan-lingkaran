/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62818
 */
import java.util.Scanner;
public class latihan22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;

        while (true) {
            System.out.println("======Perhitungan Lingkaran=====");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String input = scanner.nextLine();

            try {
                // Cek apakah input berupa angka
                diameter = Double.parseDouble(input);

                // Jika nilai diameter lebih dari 0, lanjutkan perhitungan
                if (diameter > 0) {
                    break;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai\n");
                }
            } catch (NumberFormatException e) {
                // Jika input bukan angka
                System.out.println("Nilai Diameter Tidak Sesuai\n");
            }
        }

        // Menghitung jari-jari, luas, dan keliling
        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = Math.PI * diameter;

        // Menampilkan hasil perhitungan
        System.out.println("\n======Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm²%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);

        scanner.close();
    }
}
    

