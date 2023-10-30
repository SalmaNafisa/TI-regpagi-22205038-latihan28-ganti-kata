/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ganti.kata;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Program Mengganti Kata=====");
        
        // Menerima input kalimat dari user
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        // Menerima input kata yang akan diganti
        System.out.print("Ganti kata: ");
        String kataAwal = input.nextLine();

        // Menerima input kata pengganti
        System.out.print("Menjadi kata: ");
        String kataAkhir = input.nextLine();
        
        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replaceAll(kataAwal, kataAkhir);

        // Menampilkan kalimat baru
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
    
}
