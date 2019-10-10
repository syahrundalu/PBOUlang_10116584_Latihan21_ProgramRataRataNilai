/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[],banyak, nilai;
        array = new int [100];
        float rata, total = 0;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        banyak = scan.nextInt();
        int i=1;
        while (i<=banyak){
                System.out.print("Nilai Mahasiswa ke-"+i+" = " );
                array[banyak] = scan.nextInt();
                total = total + array[banyak];
                i++;
        }
        //proses Rata-Rata
        rata = total/banyak;
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah "+rata);
        System.out.println("Developed by Muhammad Syahrun Dalu");
        
 
        
    }
}  

