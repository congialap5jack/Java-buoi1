/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Bai11 {
      public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH BANG CUU CHUONG");
        for (int so = 1; so <= 10; so++) {
            System.out.println("Bang cuu chuong : " + so + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(so + " x " + i + " = " + (so * i));
            }
            System.out.println();
        }
    }
}

