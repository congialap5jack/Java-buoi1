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
public class Bai14 {
   public static void main(String[] args) {
        System.out.println("Chuong trinh tinh diem trung binh");
         Scanner scanner = new Scanner (System.in);
        int diem;
        int somonhoc = 0;
        double tongdiem = 0;
       
        while(true)
        {
            System.out.printf("Nhap diem mon %d:", somonhoc);
            diem = scanner.nextInt();
           if(somonhoc == 3){
               System.out.println("Da dat toi gioi han so mon hoc");
               break;
           } 
            if(diem == -1) {
                break;
            }
          if((diem <=0 || diem >=11)){
                    System.out.println("Diem phai nhap tu 0 den 10");
                    continue;
        }
          somonhoc++;
          tongdiem +=diem;
        }
        double diemtrungbinh = tongdiem/somonhoc;
        System.out.printf("Ban da hoc %d mon hoc, diem binh la %f\n", somonhoc,diemtrungbinh);
    }
}.

