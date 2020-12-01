/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1android;

/**
 *
 * @author ILMA
 */
public class andro extends bantu {
     andro(String NIK, String nama, float testulis, float tescode, float teswan)
   {
      this.NIK = NIK;
      this.nama = nama;
      this.testulis = testulis;
      this.tescode = tescode;
      this.teswan = teswan;     
      
   }

    
   

   public void Cek()
   {
       if(((this.testulis*(0.2))+(this.tescode*(0.5)+(this.teswan)*(0.3)))>=85)
        {
           System.out.println("Congratulations "+this.nama+"!");
        }
       else
       {
           System.out.println("Dear, "+this.nama+" don't give up ya!");
       }
       
   }
}
