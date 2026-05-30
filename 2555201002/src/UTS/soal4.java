/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ACER
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Queue<String> antrean = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Masukkan data pesanan pelanggan");
            System.out.println("2. Tampilkan daftar antrean");
            System.out.println("3. Memproses pesanan pertama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pesanan: ");
                    String pesanan = input.nextLine();
                    antrean.add(pesanan);
                    System.out.println("Pesanan berhasil ditambahkan.");
                    break;

                case 2:
                    if (antrean.isEmpty()) {
                        System.out.println("Antrean kosong.");
                    } else {
                        System.out.println("Daftar antrean pesanan:");
                        for (String p : antrean) {
                            System.out.println("- " + p);
                        }
                    }
                    break;

                case 3:
                    if (antrean.isEmpty()) {
                        System.out.println("Tidak ada pesanan untuk diproses.");
                    } else {
                        String diproses = antrean.poll();
                        System.out.println("Pesanan diproses: " + diproses);
                    }
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}