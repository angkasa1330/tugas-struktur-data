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

public class Queue3 {
    public static void main(String[] args) {
        // Menggunakan Queue dengan tipe data String untuk nama file
        Queue<String> antrianPrinter = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("1. Tambah dokumen ke antrian (Enqueue)");
            System.out.println("2. Cetak dokumen (Dequeue)");
            System.out.println("3. Lihat dokumen berikutnya (Peek)");
            System.out.println("4. Keluar");
            
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer scanner

            switch (pilihan) {
                case 1:
                    // a. Tambah dokumen ke antrian (enqueue)
                    System.out.print("Masukkan nama file: ");
                    String namaFile = input.nextLine();
                    antrianPrinter.add(namaFile);
                    System.out.println("Tambah: " + namaFile);
                    break;

                case 2:
                    // b. Cetak dokumen (dequeue)
                    if (antrianPrinter.isEmpty()) {
                        System.out.println("Tidak ada dokumen dalam antrian");
                    } else {
                        // poll() mengambil dan menghapus elemen terdepan
                        String fileDicetak = antrianPrinter.poll();
                        System.out.println("Cetak → " + fileDicetak);
                    }
                    break;

                case 3:
                    // c. Lihat dokumen berikutnya (peek)
                    if (antrianPrinter.isEmpty()) {
                        System.out.println("Tidak ada dokumen dalam antrian");
                    } else {
                        // peek() hanya melihat elemen terdepan tanpa menghapusnya
                        String fileBerikutnya = antrianPrinter.peek();
                        System.out.println("Dokumen berikutnya yang akan dicetak: " + fileBerikutnya);
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }
}
