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

class Stack {
    private int maxSize = 5;
    private int[] stackArray;
    private int top;

    public Stack() {
        stackArray = new int[maxSize];
        top = -1; // Menandakan stack masih kosong
    }

    // Operasi Push: Menambah data
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Tidak bisa menambah data");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " berhasil dimasukkan ke stack");
        }
    }

    // Operasi Pop: Menghapus data
    public void pop() {
        if (top == -1) {
            System.out.println("Stack kosong");
        } else {
            int removedValue = stackArray[top--];
            System.out.println("Data " + removedValue + " berhasil dihapus");
        }
    }

    // Operasi Display: Menampilkan isi stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack kosong");
        } else {
            System.out.print("Isi Stack : ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        Scanner input = new Scanner(System.in);
        int pilihan, nilai;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai: ");
                    nilai = input.nextInt();
                    myStack.push(nilai);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.display();
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}