package com.modul1.codelab;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Codelab
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.println("Jenis kelamin ? JUJUR (L/P)");
        char JenisKelamin = scanner.nextLine().charAt(0);
        String JenisKelaminString = (JenisKelamin == 'L' || JenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        System.out.println("Tanggal lahir (yyyy-mm-dd) : ");
        String TanggalLahirString = scanner.nextLine();
        LocalDate TanggalLahir = LocalDate.parse(TanggalLahirString);

        LocalDate TanggalSekarang = LocalDate.now();
        int umur = Period.between(TanggalLahir, TanggalSekarang).getYears();
        int bulan = Period.between(TanggalLahir, TanggalSekarang).getMonths();

        System.out.println("\ndata diri:");
        System.out.println("Namamu : " + nama);
        System.out.println("Jenis kelamin :" + JenisKelaminString);
        System.out.println("Umur : " + umur + " tahun " + bulan + " Bulan ");
        
       scanner.close();

       
    }
}
