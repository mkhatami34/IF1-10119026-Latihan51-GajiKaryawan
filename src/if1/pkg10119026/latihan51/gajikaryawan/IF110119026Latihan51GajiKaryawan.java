/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan program gaji karyawan
 */
public class IF110119026Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager menejer = new Manager();
        Scanner scan = new Scanner(System.in);

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        menejer.setNik(scan.next());
        System.out.print("Masukkan Nama : ");
        menejer.setNama(scan.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        menejer.setGolongan(scan.nextInt());
        System.out.print("Masukkan Jabatan (menejer/Kabag) :");
        menejer.setJabatan(scan.next().toLowerCase());
        System.out.print("Masukkan jumlah kehadiran :");
        menejer.setKehadiran(scan.nextInt());
        
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK : "+menejer.getNik());
        System.out.println("Nama : "+menejer.getNama());
        System.out.println("Golongan : "+ menejer.getGolongan());
        System.out.println("Jabatan : "+menejer.getJabatan()+"\n");
        System.out.println("Tunjangan Golongan : "+menejer.tunjanganGolongan(menejer.getGolongan()));
        System.out.println("Tunjangan Jabatan : "+menejer.tunjanganJabatan(menejer.getJabatan()));
        System.out.println("Tunjangan Kehadiran : "+menejer.tunjanganKehadiran(menejer.getKehadiran())+"\n");
        System.out.println("Gaji Total : "+menejer.gajiTotal());
    }
    
}
