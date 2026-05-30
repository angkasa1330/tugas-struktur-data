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
import java.util.Stack;

public class soal3 {
    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n MENU UNDO");
            System.out.println("1. Tambah aksi");
            System.out.println("2. Undo aksi terakhir");
            System.out.println("3. Tampilkan semua aksi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan aksi : ");
                    String aksi = input.nextLine();
                    undoStack.push(aksi);
                    System.out.println("Aksi disimpan : " + aksi);
                    break;

                case 2:
                    if (!undoStack.isEmpty()) {
                        String undoAksi = undoStack.pop();
                        System.out.println("Undo aksi : " + undoAksi);
                    } else {
                        System.out.println("Tidak ada aksi yang bisa di-undo.");
                    }
                    break;

                case 3:
                    if (undoStack.isEmpty()) {
                        System.out.println("Belum ada aksi.");
                    } else {
                        System.out.println("Daftar aksi (terakhir di atas):");
                        for (int i = undoStack.size() - 1; i >= 0; i--) {
                            System.out.println("- " + undoStack.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }
}