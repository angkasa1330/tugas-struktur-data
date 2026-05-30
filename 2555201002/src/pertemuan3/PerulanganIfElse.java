/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
public class PerulanganIfElse {
    public static void main(String[] args) {
        int nilaiAkhir = 76;
        char grade;
        
        if (nilaiAkhir >= 90){
            grade = 'A';
        }
        else if (nilaiAkhir >= 80){
            grade = 'B';
        }
        else if (nilaiAkhir >= 70){
            grade = 'C';
        }
        else if (nilaiAkhir >= 60){
            grade = 'D';
        }
        else {grade = 'E';}
        
        System.out.println("NIlai akhir adalah " + grade);
    }
    
}
