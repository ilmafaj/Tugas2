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
public class Balok extends PersegiPanjang implements MenghitungRuang {
    protected double tinggi;
    
  public Balok (double panjang, double lebar, double tinggi) {
      super(panjang, lebar);
      this.tinggi = tinggi;
  }
    @Override
    public double Volume()
    {
        return (super.panjang*super.lebar*this.tinggi);
    }
    
    @Override
    public double LuasPermukaan()
    {
        return (2*((super.panjang*super.lebar)+(this.tinggi*super.lebar)+(this.tinggi*super.panjang)));
    }

}