/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai16 {
     public static void main(String[] args) {
        System.out.println("Chuong trinh tinh so thoc tren ban co");
        int soO;
        System.out.println("Nhap so O");
        Scanner nhap =  new Scanner(System.in);
        soO = nhap.nextInt();
        System.out.printf("Tong so thoc tren %d la %f\n", soO, TinhSoThoc(soO));
    }
    private static double TinhSoThoc(int soO) {
        double tong=0;
        for (int i = 0; i < soO; i++){
            tong += Math.pow(2, i);
        }
        return tong;
    }
}

