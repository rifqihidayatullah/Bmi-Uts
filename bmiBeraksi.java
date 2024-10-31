/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class bmiBeraksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi badan anda : ");
        double tinggi = input.nextDouble();
        
        System.out.print("Masukkan berat badan anda : ");
        double berat = input.nextDouble();
        
        bmi bmisaya = new bmi(tinggi , berat);
        bmisaya.hasilStatus();
    }
}
