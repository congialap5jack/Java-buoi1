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
public class Bai4 {
     public static void main(String[] args) {
    System.out.println("Chuong trinh tinh hieu 2 so");

Scanner sc = new Scanner(System.in);
System.out.println("Nhap so a ");
int a = sc.nextInt();
System.out.println("Nhap so b ");
int b = sc.nextInt();
    System.out.printf("%d + %d = %d\n",a,b,tinhtong(a,b));
        System.out.printf("%d - %d = %d\n",a,b,tinhhieu(a,b));
        System.out.printf("%d * %d = %d\n",a,b,tinhtich(a,b));
        System.out.printf("%d / %d = %f\n",a,b,tinhthuong(a,b));
    

}
   public static int tinhtong(int a, int b) { return a + b; }
   public static int tinhhieu(int a, int b) { return a - b; }
   public static int tinhtich(int a, int b) { return a * b; }
   public static double tinhthuong(int a, int b) { return (double)a / b; }
   public static String TinhThuongMoi(int a, int b) {
       //return (double)a / b;
   
    if (b == 0) {
        return "Khong the chia cho 0";
    } else {
        return Double.toString((double)a / b);
        //return (double)a / b;
    }
}
}
