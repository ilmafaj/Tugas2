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
public class PersegiPanjang implements MenghitungBidang {
    protected double panjang;
    protected double lebar;

public PersegiPanjang(double panjang, double lebar)
{
    this.panjang = panjang;
    this.lebar = lebar;
    
}

@Override
public double Luas()
{
   return (this.panjang*this.lebar);
}

@Override
public double Keliling()
{
    return (2*(this.panjang+this.lebar));
}

}