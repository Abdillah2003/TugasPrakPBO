package abdillah;

public class Konversi {

        int celcius;
        public Konversi(int celcius){
            this.celcius = celcius;
        } 
   
   float fahrenheit(){
       return((9*celcius)/5)+32;
   }
   
   float reamur(){
       return(4*celcius)/5;
   }
   double kelvin(){
       return celcius + 273.15;
   }
   
   void simpan(){
       System.out.println("Suhu Dalam Celcius    : " + celcius + ".0° C");
        if(celcius<=0){
           System.out.println("Air Dalam Kondisi Membeku");
       }else if(celcius >=1  && celcius <=37){
           System.out.println("Air Dalam Kondisi Normal");  
       }else if(celcius >=38 && celcius <= 99){
            System.out.println("Air Dalam Kondisi Panas");
       }else{
           System.out.println("Air Dalam Kondisi Mendidih");
       }
       System.out.println("Suhu Dalam Farenheit  : " + fahrenheit()+ " F");
       System.out.println("Suhu Dalam Reamur     : " + reamur() + " R") ;
       System.out.println("Suhu  Dalam Kelvin    : " + kelvin() + " K");
   }  
    }