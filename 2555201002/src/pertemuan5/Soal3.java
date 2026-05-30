/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
import java.util.Stack;

public class Soal3 {
    public static void main(String[] args) {
        Stack<String> riwayat = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        String halaman;

        do {
            // Menampilkan halaman saat ini menggunakan peek()
            if (riwayat.isEmpty()) {
                System.out.println("Halaman Saat Ini: (Kosong)");
            } else {
                System.out.println("Halaman Saat Ini: " + riwayat.peek());
            }

            System.out.println("1. Kunjungi Halaman Baru");
            System.out.println("2. Undo (Kembali)");
            System.out.println("3. Lihat Riwayat Lengkap");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama halaman: ");
                    halaman = input.nextLine();
                    riwayat.push(halaman);
                    System.out.println("Berhasil mengunjungi: " + halaman);
                    break;

                case 2:
                    if (riwayat.isEmpty()) {
                        System.out.println("Pesan: Tidak ada halaman sebelumnya.");
                    } else {
                        String dihapus = riwayat.pop();
                        System.out.println("Keluar dari: " + dihapus);
                        
                        if (!riwayat.isEmpty()) {
                            System.out.println("Kembali ke: " + riwayat.peek());
                        } else {
                            System.out.println("Sekarang tidak ada halaman yang terbuka.");
                        }
                    }
                    break;

                case 3:
                    if (riwayat.isEmpty()) {
                        System.out.println("Riwayat kosong.");
                    } else {
                        System.out.println("Riwayat (Terbaru -> Lama): " + riwayat);
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}