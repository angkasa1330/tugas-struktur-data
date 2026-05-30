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

public class soal6 {
    static Scanner input = new Scanner(System.in);
    static int[] harga = new int[10];
    static boolean dataTerisi = false;

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Masukkan data harga");
            System.out.println("2. Tampilkan data harga");
            System.out.println("3. Urutkan harga (termurah ke termahal)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    sortingBubble();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    static void inputData() {
        System.out.println("\nMasukkan 10 harga produk:");
        for (int i = 0; i < harga.length; i++) {
            System.out.print("Harga ke-" + (i + 1) + ": ");
            harga[i] = input.nextInt();
        }
        dataTerisi = true;
    }

    static void tampilData() {
        if (!dataTerisi) {
            System.out.println("Data belum dimasukkan.");
            return;
        }
        System.out.println("\nData harga:");
        for (int h : harga) {
            System.out.print(h + " ");
        }
        System.out.println();
    }

    static void sortingBubble() {
        if (!dataTerisi) {
            System.out.println("Data belum dimasukkan.");
            return;
        }

        System.out.println("\nData sebelum sorting:");
        tampilData();

        for (int i = 0; i < harga.length - 1; i++) {
            for (int j = 0; j < harga.length - 1 - i; j++) {
                if (harga[j] > harga[j + 1]) {
                    int temp = harga[j];
                    harga[j] = harga[j + 1];
                    harga[j + 1] = temp;
                }
            }
        }

        System.out.println("\nData setelah sorting (termurah ke termahal):");
        tampilData();
    }
}