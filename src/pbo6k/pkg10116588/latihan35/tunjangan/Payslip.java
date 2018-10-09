/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan35.tunjangan;

/**
 *
 * @author Indra F
 */
public class Payslip {
    private static final double ALLOWANCES = 0.35;

    private double salary;
    private boolean isMarried;


    public Payslip(double salary, boolean isMarried){
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public void calculateSalary(){
        System.out.println();
        System.out.println("===== Hasil Perhitungan Gaji Anda =====");
        System.out.println("Gaji Pokok\t\t: Rp ".concat(String.valueOf(salary)));
        System.out.println("Tunjangan\t\t: Rp ".concat(String.valueOf(salary * (isMarried ? ALLOWANCES : 0))));
        System.out.println("Total Gaji\t\t: Rp ".concat(String.valueOf(salary + (salary * (isMarried ? ALLOWANCES : 0)))));
    }
 
}
