/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author ACER
 */
class ContohMethodParameter {
    
    //contoh prosedur parameter
    void luasSegitiga(int alas, int tinggi){
        int a=alas;
        int t=tinggi;
        double L=0.5*a*t;
        System.out.println("Luas segitiga = "+L);
    }
    
    //contoh fungsi parameter
    double luasLingkaran(double jari2){
        double phi=3.14;
        double r=jari2;
        double L=phi*r*r;
        System.out.println("Luas lingkaran = "+L);
        return L;
    }
    
    public static void main(String[] args) {
        ContohMethodParameter Prosedur=new ContohMethodParameter();
        Prosedur.luasSegitiga(10,5);
        ContohMethodParameter Fungsi=new ContohMethodParameter();
        Fungsi.luasLingkaran(8);
    }
}