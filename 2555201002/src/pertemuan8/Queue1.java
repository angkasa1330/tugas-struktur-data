/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class Queue1 {
    // 1. Array dengan ukuran maksimal 5
    int ukuranMaks = 5;
    int[] queue = new int[ukuranMaks];
    int front = -1;
    int rear = -1;

    // 2a. Operasi Enqueue (Tambah data)
    void enqueue(int data) {
        if (rear == ukuranMaks - 1) {
            System.out.println("❌ Queue Penuh! Tidak dapat menambahkan data.");
        } else {
            if (front == -1) {
                front = 0; // Set front ke 0 saat elemen pertama masuk
            }
            rear++;
            queue[rear] = data;
            System.out.println("✅ Data " + data + " berhasil ditambahkan (Enqueue).");
        }
    }

    // 2b. Operasi Dequeue (Hapus data)
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("❌ Queue Kosong! Tidak ada data yang bisa dihapus.");
        } else {
            System.out.println("🗑️ Data " + queue[front] + " berhasil dihapus (Dequeue).");
            front++;
            
            // Reset pointer jika queue sudah benar-benar kosong setelah di-dequeue
            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    // 2c. Operasi Display (Tampilkan isi queue)
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("📭 Queue Kosong!");
        } else {
            System.out.print("📋 Isi Queue saat ini: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Menu Utama di Console
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            
            // Mencegah error jika input bukan angka
            while (!scanner.hasNextInt()) {
                System.out.print("Input tidak valid! Masukkan angka 1-4: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data angka: ");
                    int data = scanner.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("👋 Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("⚠️ Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}