/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferdy;

import java.util.Scanner;

/**
 *
 * @author hudax
 */
public class Ferdy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //inisialisasi java library scanner
        Scanner scan = new Scanner(System.in);
     //menampilkan menu makanan
        System.out.println("MENU MAKANAN : ");
        System.out.println("___________________________________________________________________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Ayam Goreng      Rp 8000,00");
        System.out.println("2. Tumis Kangkung   Rp 6000,00");
        System.out.println("3. Tempe Goreng     Rp 4000,00");
        System.out.println("4. Nasi Goreng      Rp 10.000,00");
        System.out.println("5. Sushi            Rp 12.500,00");
        System.out.println("");

        //inisialisasi pembayaran awal
        int harga = 0;
        //inisialisasi harga kelima menu
        int h1 = 8000, h2 = 6000, h3 = 4000, h4 = 5000, h5 = 12500;
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("___________________________________________________________________");
        //pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.println("___________________________________________________________________");

        if (inNomor == 1)
        {
        //jika nomor satu, maka menu yang dipilih adalah ayam goreng, dan harganya adalah h1, yang merupakan harga menu pertama
            menu = " Ayam Goreng";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            harga = harga + h1;
        }
            else if (inNomor == 2)
            {
        //jika nomor dua, maka menu yang dipilih adalah tumis kangkung, dan harganya adalah h2, yang merupakan harga menu kedua
                menu = " Tumis Kangkung";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2;
            }
                else if (inNomor == 3)
                {
        //jika nomor tiga, maka menu yang dipilih adalah tempe goreng, dan harganya adalah h3, yang merupakan harga menu ketiga
                    menu = " Tempe Goreng";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3;
                }
                 else if (inNomor == 4)
                {
        //jika nomor empat, maka menu yang dipilih adalah nasi goreng, dan harganya adalah h4, yang merupakan harga menu keempat
                    menu = " Nasi Goreng";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h4;
                }
                 else if (inNomor == 5)
                {
        //jika nomor lima, maka menu yang dipilih adalah sushi, dan harganya adalah h5, yang merupakan harga menu kelima
                    menu = " Sushi";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h5;
                }
                     else
        //jika selain nomor satu sampai lima, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }

        //User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
    }
}
    
    

