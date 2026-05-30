/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
public class PercabanganSwitchcase {
    public static void main(String[] args) {
        char nilai = 'B';

        switch (nilai) {
            case 'A':
                System.out.println("Nilai sangat baik");
                break;
            case 'B':
                System.out.println("Nilai baik");
                break;
            case 'C':
                System.out.println("Nilai cukup");
                break;
            default:
                System.out.println("Nilai tidak valid");
        }
    }
}
