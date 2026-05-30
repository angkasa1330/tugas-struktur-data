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

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Menerima input kata
        System.out.print("Masukkan sebuah kata: ");
        String kata = input.nextLine();
        
        // 2. Inisialisasi Stack untuk menyimpan karakter
        Stack<Character> tumpukan = new Stack<>();
        
        // 3. Proses PUSH: Masukkan setiap karakter ke dalam stack
        for (int i = 0; i < kata.length(); i++) {
            tumpukan.push(kata.charAt(i));
        }
        
        // 4. Proses POP: Ambil karakter dari stack dan susun kembali
        StringBuilder kataTerbalik = new StringBuilder();
        while (!tumpukan.isEmpty()) {
            kataTerbalik.append(tumpukan.pop());
        }
        
        // 5. Tampilkan hasil
        System.out.println("Kata terbalik: " + kataTerbalik.toString());
        
        input.close();
    }
}