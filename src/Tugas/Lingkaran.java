/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ILMA
 */
public class Lingkaran implements MenghitungBidang {
   protected double jarijari;

   

public Lingkaran (double jarijari)
{
this.jarijari = jarijari;
}

@Override
public double Luas()
{
 return (Math.PI*this.jarijari*this.jarijari);
}
@Override
public double Keliling()
{
    return (Math.PI*2*this.jarijari);
}
}