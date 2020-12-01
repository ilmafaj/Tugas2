/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1android;
import java.util.Scanner;

/**
 *
 * @author ILMA
 */
public class main {
    public static void main(String[] args)
            {
    //input user
  Scanner InputNIK = new Scanner(System.in);
  Scanner Inputnama = new Scanner(System.in);
  Scanner Inputtestulis = new Scanner(System.in);
  Scanner Inputtescode = new Scanner(System.in);
  Scanner Inputteswan = new Scanner(System.in);
  Scanner Temp = new Scanner(System.in);
                        
   System.out.println("1. Android Development\n");
   System.out.println("2. Web Development\n");
   System.out.println("pilih");
                         
                     int pilihdivisi = Temp.nextInt();
                   
    //main menu
                     System.out.println("Masukkan NIK: ");
                        String NIK = InputNIK.nextLine();
                     System.out.println("Masukkan nama: ");
                        String nama = Inputnama.nextLine();
                     System.out.println("Masukkan Nilai Tes Tulis: ");
                        int testulis = Inputtestulis.nextInt();
                     System.out.println("Masukkan Nilai Tes Coding: ");
                        int tescode = Inputtescode.nextInt();
                     System.out.println("Masukkan Nilai Tes Wawancara: ");
                        int teswan = Inputteswan.nextInt();
        
                    int PilihanMenu ;
            
        do{  
                  System.out.println("\n\nMenu\n1.Edit\n2.Tampil\n3.Exit \nPilih ");
                  
                        PilihanMenu = Temp.nextInt();
                        
                          web web1 = new web(NIK,nama,testulis,tescode,teswan);
                          andro andro1 = new andro(NIK,nama,testulis,tescode,teswan); 
                            
                        
                switch(PilihanMenu)
                           {
                               case 1-> {
                                               System.out.println("Masukkan Nilai Tes Tulis: ");
                                                 testulis = Inputtestulis.nextInt();
                                               System.out.println("Masukkan Nilai Tes Coding: ");
                                                  tescode = Inputtescode.nextInt();
                                               System.out.println("Masukkan Nilai Tes Wawancara: ");
                                                     teswan = Inputteswan.nextInt(); 
                                                  
                                                web1.Edit(testulis, tescode, teswan);
                                                andro1.Edit(testulis, tescode, teswan);     
                                         }
                              
                               case 2->
                                        {
                                            switch(pilihdivisi)
                                            {
                                                case 1 -> andro1.Cek();
                                                case 2 -> web1.Cek();
                                            } 
                                         }
                            
                               case 3->
                                            {
                                                return;
                                            }
                           }
        }
        while(PilihanMenu!=3);
         
            }
}
