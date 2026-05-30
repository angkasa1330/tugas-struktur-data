/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author ACER
 */
class ContohMethod {
    
    //contoh prosedur
   void luasPersegiPanjang (){
       int p=10;
       int l=5;
       int L=p*l;
       System.out.println("Luas persegi panjang = "+L);
   }
   
   //contoh fungsi
   int luasPersegi(){
       int sisi=10;
       int L=sisi*sisi;
       System.out.println("Luas persegi = "+L);
       return L;
   }
   
    public static void main(String[] args) {
        ContohMethod Prosedur=new ContohMethod();
        Prosedur.luasPersegiPanjang();
        ContohMethod Fungsi=new ContohMethod();
        Fungsi.luasPersegi();
    }
}
