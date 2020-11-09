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
public class Kerucut extends Lingkaran implements MenghitungRuang {
    protected double tinggi;

    public Kerucut(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume() {
      return (Math.PI*super.jarijari*super.jarijari*this.tinggi)/3;
    }

    @Override
    public double LuasPermukaan() {
        double sisimiring = Math.sqrt((super.jarijari*super.jarijari)+(this.tinggi*this.tinggi));
        return (Math.PI*super.jarijari*super.jarijari+Math.PI*super.jarijari*sisimiring);
    }
    
    
}
