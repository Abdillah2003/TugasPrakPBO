package tugas2;


import java.util.Scanner;
import tugas2.Ruang.Balok;
import tugas2.Ruang.Tabung;

public class main{

    
   public static void main(String[] args) {
        boolean loop=  false ;
        int back;
        while(loop == false) {
        
        int pilih;
        double panjang,lebar,tinggiBalok,jari,tinggiTabung;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("+---------------------------------+");
        System.out.println("+     ~~~~ MENU  UTAMA ~~~~       +");
        System.out.println("+---------------------------------+");
        System.out.println("1. MENGHITUNG BALOK");
        System.out.println("2. MENGHITUNG TABUNG");
        System.out.println("3. EXIT");
        System.out.println("+---------------------------------+");
        System.out.print("Masukan Pilihan : "); pilih = input.nextInt();
        
        if(pilih == 1){
       
            System.out.print("Input Panjang   : "); panjang = input.nextInt();
            System.out.print("Input Lebar     : "); lebar = input.nextInt();
            System.out.print("Input Tinggi    : "); tinggiBalok = input.nextInt();
                
            Balok balok = new Balok(tinggiBalok,panjang,lebar);
                
            System.out.println("+-------------------------+");
            System.out.println("   ~~~~~~~~HASIL~~~~~~~   +");
            System.out.println("+-------------------------+");
            System.out.println("LUAS PERSEGI            : " + balok.luas());
            System.out.println("KELILING PERSEGI        : " + balok.keliling());
            System.out.println("VOLUME BALOK            : " + balok.volume());
            System.out.println("LUAS PERMUKAAN BALOK    : " + balok.luasPermukaan());
            System.out.println("\n\n");
                
        }else if(pilih == 2) {
            System.out.print("Input Jari-Jari : "); jari = input.nextInt();
            System.out.print("Input Tinggi    : "); tinggiTabung = input.nextInt();
        
                
            Tabung tabung = new Tabung(tinggiTabung,jari);
            
            System.out.println("+-------------------------+");
            System.out.println("   ~~~~~~~~HASIL~~~~~~~   +");
            System.out.println("+-------------------------+");
            System.out.println("LUAS LINGKARAN          : " + tabung.luas());
            System.out.println("KELILING LINGKARAN      : " + tabung.keliling());
            System.out.println("VOLUME TABUNG           : " + tabung.volume());
            System.out.println("LUAS PERMUKAAN TABUNG   : " + tabung.luasPermukaan());
            System.out.println("\n\n");
                
        }else if(pilih  == 3){
            System.exit(0);
         
        }else{
                
            System.out.println("SILAHKAN INPUT ULANG");
            loop = true;      
        } 
            System.out.print("Ke Menu Utama lagi? (ya = 1 || Tidak = 0) = " );
            back = input.nextInt();
            if (back == 1){
                loop = false;
            }else if( back == 0) {
                loop = true;
            }  
      }
    }
  }
