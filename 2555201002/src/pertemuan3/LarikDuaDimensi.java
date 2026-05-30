/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
public class LarikDuaDimensi {
    public static void main(String[] args) {
         String[][] nama = {
            {"Andi", "Budi"},
            {"Citra", "Dina"}
        };

        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++) {
                System.out.println("Nama: " + nama[i][j]);
            }
        }
    }
}
