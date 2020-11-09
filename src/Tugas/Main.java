/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author ILMA
 */
public class Main {
    public static void main(String[] args)
    {

    Scanner Baca = new Scanner(System.in);
    char Pilih;
    double jarijari, panjang, lebar, tinggi;
    MenghitungBidang bidang;
    MenghitungRuang ruang;
    
    do{
    
    System.out.println ("Menu");
    System.out.println ("1. Balok");
    System.out.println ("2. Kerucut");
    System.out.println ("3. Keluar");
    System.out.println ("Pilih : ");
            
    Pilih = Baca.next().charAt(0);
    
    switch (Pilih){
        case '1':
            
            System.out.print("Panjang : ");
            panjang=Baca.nextDouble();
            System.out.print("Lebar   : ");
            lebar=Baca.nextDouble();
            System.out.print("Tinggi  : ");
            tinggi=Baca.nextDouble();
            PersegiPanjang pp = new PersegiPanjang(panjang,lebar);
            bidang = pp;
            Balok bal = new Balok(panjang, lebar, tinggi);
            System.out.println("Luas Persegi Panjang "+bidang.Luas());
            System.out.println("Keliling Persegi Panjang "+bidang.Keliling());
            System.out.println("Volume Balok : "+bal.Volume());
            System.out.println("Luas Permukaan Balok : "+bal.LuasPermukaan());
            
            System.out.println("Kembali ke menu y/n? ");
            Pilih = Baca.next().charAt(0);
            break;
            
           case '2':
            
            System.out.print("Jari-jari : ");
            jarijari=Baca.nextDouble();
            System.out.print("Tinggi   : ");
            tinggi=Baca.nextDouble();
            Lingkaran ling = new Lingkaran(jarijari);
            Kerucut cut = new Kerucut(tinggi, jarijari);
            ruang = cut;
            System.out.println("Luas Lingkaran "+ling.Luas());
            System.out.println("Keliling Lingkaran "+ling.Keliling());
            System.out.println("Volume Kerucut : "+ruang.Volume());
            System.out.println("Luas Permukaan : "+ruang.LuasPermukaan());
            System.out.println("Kembali ke menu y/n? ");
            Pilih = Baca.next().charAt(0);
            break;
    }
            
}while (Pilih =='y' || Pilih =='Y');

}
}