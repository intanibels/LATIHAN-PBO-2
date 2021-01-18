/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg2;
import java.util.Scanner; //agar program dapat menginput data dari keyboard
/**
 *
 * @author Intan
 */
public class LATIHAN2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); //membuat scanner baru
        int pilihan = 9; //deklarasi variabel
        do{ //melakukan perulangan
            System.out.println("\nMENU LUAS BANGUN\n"); //membuat judul
            System.out.println("1. Menghitung Luas Persegi"); //membuat pilihan pertama yaitu luas persegi
            System.out.println("2. Menghitung Luas Persegi Panjang"); //membuat pilihan kedua yaitu luas persegi panjang
            System.out.println("3. keluar"); //membuat pilihan ketiga, 
            System.out.print("Masukkan pilihan anda : "); //menampilkan instruksi kepada user
            pilihan = masukan.nextInt(); //untuk menerima inputan dari keyboard
            switch(pilihan){ //melakukan percabangan
                case 1 : LuasPersegi(); break; //jika memilih nomer 1, akan beralih ke program luas persegi
                case 2 : LuasPersegiPanjang(); break; //jika memilih nomer 2, akan beralih ke program luas persegi panjang
            }
        }while(pilihan!=3); //perulangan akan terus terlang sampai pilihan yang diinput user adalah nomer 3
    }private static void LuasPersegi(){
        Scanner masukan = new Scanner(System.in); //membuat scanner baru
        float sisi,luas; //deklarasi variabel
        System.out.print("Masukkan nilai sisi : "); //memberi instruksi kepada user untuk menginputkan nilai sisi
        sisi = masukan.nextFloat(); //untuk menerima nilai sisi
        luas = sisi*sisi; //program untuk menghitung luas persegi
        System.out.print("Luas Persegi adalah : "+luas); //melakukan hasil output terakhir
    }private static void LuasPersegiPanjang(){
        Scanner masukan = new Scanner(System.in); //membuat scanner baru
        float panjang, lebar, luas; //deklarasi variabel
        System.out.print("Masukkan nilai panjang : "); //memberi instruksi kepada user untuk menginputkan nilai panjang
        panjang = masukan.nextFloat(); //untuk menerima nilai panjang
        System.out.print("Masukkan nilai lebar   : "); //memberi instruksi kepada user untuk menginputkan nilai lebar
        lebar = masukan.nextFloat(); //untuk menerima nilai lebar
        luas = panjang*lebar; //program untuk menghitung luas persegi panjang
        System.out.print("Luas Persegi Panjang adalah : "+luas); //melakukan hasil output terakhir
    }
}
