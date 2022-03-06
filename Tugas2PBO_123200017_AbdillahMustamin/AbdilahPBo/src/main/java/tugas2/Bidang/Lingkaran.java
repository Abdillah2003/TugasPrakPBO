package tugas2.Bidang;

public class Lingkaran implements MenghitungBidang{

    private double jariJari;

    public Lingkaran(double jari) {
        this.jariJari = jari;
    }
    public double getJari() {
        return jariJari;
    }

    public void setJari(double jari) {
        this.jariJari = jari;
    }
    
    @Override
    public double luas() {
      return 3.14*jariJari*jariJari;    
     
    }
    
    @Override
    public double keliling() {

         return 3.14*2*jariJari;          
         }
  

}  
    
