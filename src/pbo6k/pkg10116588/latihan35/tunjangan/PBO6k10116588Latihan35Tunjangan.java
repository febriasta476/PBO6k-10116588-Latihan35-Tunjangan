/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan35.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Indra F
 * Nama                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan Program Tunjangan
 */
public class PBO6k10116588Latihan35Tunjangan {
     public static String DEFAULT_POSITIF_ANSWER = "Menikah";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        System.out.println("===== Program Tunjangan =====");
        System.out.print("Berapa Gaji Pokok anda perbulan?\t: Rp. ");
        double gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        String status = scannerText.nextLine();        

        Payslip payslip = new Payslip(gaji, status.equalsIgnoreCase(DEFAULT_POSITIF_ANSWER));
        payslip.calculateSalary();
    }
    
}
