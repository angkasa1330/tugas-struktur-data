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

public class soal2 {
    static Scanner input = new Scanner(System.in);

    static final int JUMLAH_PRODUK = 3;
    static final int JUMLAH_HARI = 7;

    static int[][] penjualan = new int[JUMLAH_PRODUK][JUMLAH_HARI];
    static int[] totalProduk = new int[JUMLAH_PRODUK];

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Isi data");
            System.out.println("2. Hitung total penjualan tiap produk");
            System.out.println("3. Tentukan produk dengan penjualan tertinggi");
            System.out.println("4. Tampilkan seluruh data dalam bentuk tabel");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    isiData();
                    break;
                case 2:
                    hitungTotal();
                    break;
                case 3:
                    produkTertinggi();
                    break;
                case 4:
                    tampilkanTabel();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 0);
    }

    static void isiData() {
        for (int i = 0; i < JUMLAH_PRODUK; i++) {
            System.out.println("Produk ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    static void hitungTotal() {
        for (int i = 0; i < JUMLAH_PRODUK; i++) {
            totalProduk[i] = 0;
            for (int j = 0; j < JUMLAH_HARI; j++) {
                totalProduk[i] += penjualan[i][j];
            }
            System.out.println("Total penjualan produk ke-" + (i + 1) + ": " + totalProduk[i]);
        }
    }

    static void produkTertinggi() {
        int max = totalProduk[0];
        int indeks = 0;

        for (int i = 1; i < JUMLAH_PRODUK; i++) {
            if (totalProduk[i] > max) {
                max = totalProduk[i];
                indeks = i;
            }
        }

        System.out.println("Produk dengan penjualan tertinggi: Produk ke-" + (indeks + 1));
        System.out.println("Total penjualan: " + max);
    }

    static void tampilkanTabel() {
        System.out.println("\nTABEL PENJUALAN");
        System.out.print("Produk\t");
        for (int j = 0; j < JUMLAH_HARI; j++) {
            System.out.print("H" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < JUMLAH_PRODUK; i++) {
            System.out.print("P" + (i + 1) + "\t");
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
}