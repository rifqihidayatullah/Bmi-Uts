/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author user
 */
public class bmi {

    double tinggi;
    double berat;

    public bmi(double tinggi, double berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public double hitung() {
        double m = tinggi / 100;
        return berat / (m * m);
    }

    public void hasilStatus() {
        double bmi = hitung();
        System.out.printf("Bmi anda : %.1f%n" , bmi);
        if (bmi < 18.5) {
            System.out.println("Status anda : Kurus");
        } else if (bmi < 25) {
            System.out.println("Status Anda : Normal");
        } else if (bmi < 30) {
            System.out.println("Status anda : Berat berlebih");
        } else {
            System.out.println("Status anda : Obesitas");
        }
    }
}
