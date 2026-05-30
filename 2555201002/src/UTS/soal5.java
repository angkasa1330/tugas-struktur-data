/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ACER
 */
import java.util.Arrays;

public class soal5 {

    // Bubble Sort
    static void bubbleSort(String[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].compareToIgnoreCase(data[j + 1]) > 0) {
                    String temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(String[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].compareToIgnoreCase(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(String[] data) {
        for (int i = 1; i < data.length; i++) {
            String key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].compareToIgnoreCase(key) > 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] mahasiswa = {
            "Budi", "Andi", "Citra", "Dewi", "Eka"
        };

        String[] data1 = mahasiswa.clone();
        String[] data2 = mahasiswa.clone();
        String[] data3 = mahasiswa.clone();

        bubbleSort(data1);
        selectionSort(data2);
        insertionSort(data3);

        System.out.println("Bubble Sort   : " + Arrays.toString(data1));
        System.out.println("Selection Sort: " + Arrays.toString(data2));
        System.out.println("Insertion Sort: " + Arrays.toString(data3));
    }
}