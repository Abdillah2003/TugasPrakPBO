package abdillah;

import  java.util.Scanner;
import abdillah.Konversi;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
     int pil;
     int celcius;
     char loop = 'y';
           
     
        System.out.println("+-------------------------------------+");
        System.out.println("    ~~~~KONVERSI SUHU CELCIUS~~~~      ");
        System.out.println("+-------------------------------------+");
        System.out.print("Masukan Suhu Dalam : ");celcius =input.nextInt();
        
        Konversi konv = new Konversi(celcius);
        
        while(loop=='y'||loop=='Y'){
            
            System.out.println("\n\n+------------------------------------+");
            System.out.println("  ~~~~~Pilih Yang Akan dilihat~~~~~~  ");
            System.out.println("+------------------------------------+");
            System.out.println("1. Lihat Data");
            System.out.println("2. Edit  Data");
            System.out.println("3. exit");
            System.out.print("Masukan Pilihan Anda ? :  ");
            pil = input.nextInt();
            
            if(pil==1){
                konv.simpan();
            }else if(pil==2){
                System.out.print("Input  Data Dalam Celcius : ");konv.celcius=input.nextInt();
            }else  if(pil==3){
                System.exit(0);
            }else{
                System.out.println("silahkan pilih menu 1 sd 3!!");
                
            }
        }
    }
    
}
