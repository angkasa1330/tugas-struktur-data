/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author ACER
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue2 {
    public static void main(String[] args) {
        // Menggunakan LinkedList sebagai implementasi antarmuka Queue
        Queue<Integer> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        int pilihan;
        int nomorOtomatis = 1; // Variabel untuk men-generate nomor antrian

        do {
            System.out.println("1. Ambil nomor antrian (Enqueue)");
            System.out.println("2. Panggil antrian (Dequeue)");
            System.out.println("3. Tampilkan antrian yang menunggu");
            System.out.println("4. Keluar");
            
            // Validasi input agar tidak error jika memasukkan huruf
            while (!scanner.hasNextInt()) {
                System.out.print("Input tidak valid! Masukkan angka 1-4: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();

            System.out.println("---------------------------------");
            
            switch (pilihan) {
                case 1:
                    // a. Ambil nomor antrian (enqueue)
                    antrian.add(nomorOtomatis);
                    System.out.println("Ambil nomor: " + nomorOtomatis);
                    nomorOtomatis++; // Naikkan angka untuk pelanggan berikutnya
                    break;
                    
                case 2:
                    // b. Panggil antrian (dequeue)
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        // poll() mengambil dan menghapus elemen pertama dari Queue
                        int nomorDipanggil = antrian.poll();
                        System.out.println("Panggil → nomor " + nomorDipanggil);
                    }
                    break;
                    
                case 3:
                    // c. Tampilkan antrian yang menunggu
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.print("Antrian yang menunggu: ");
                        // Iterasi isi antrian tanpa menghapusnya
                        for (Integer nomor : antrian) {
                            System.out.print(nomor + " ");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 4:
                    System.out.println("Menutup layanan loket. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak ada di menu. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}