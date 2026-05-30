/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] kursi = new int[5][5];
        int pilihan;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Tampilkan denah tempat duduk");
            System.out.println("2. Isi tempat duduk");
            System.out.println("3. Hitung kursi kosong dan terisi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Denah Tempat Duduk:");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(kursi[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Masukkan baris (0-4): ");
                    int baris = input.nextInt();
                    System.out.print("Masukkan kolom (0-4): ");
                    int kolom = input.nextInt();

                    if (baris >= 0 && baris < 5 && kolom >= 0 && kolom < 5) {
                        kursi[baris][kolom] = 1;
                        System.out.println("Kursi berhasil diisi.");
                    } else {
                        System.out.println("Posisi tidak valid.");
                    }
                    break;

                case 3:
                    int kosong = 0, terisi = 0;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (kursi[i][j] == 0)
                                kosong++;
                            else
                                terisi++;
                        }
                    }
                    System.out.println("Jumlah kursi kosong: " + kosong);
                    System.out.println("Jumlah kursi terisi: " + terisi);
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}