/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Ruang;
import tugas2.Bidang.Lingkaran;
/**
 *
 * @author acer
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (luas()*tinggi);
       
    }

    @Override
    public double luasPermukaan() {
      return (2*luas())+ (2*Math.PI*getJari()*tinggi);
    } 

}