/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

import java.util.*;

/**
 *
 * @author truongcss
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float d, r, cv, dt;
        int n;
        System.out.println("Nhap vao truy van :");
        n = sc.nextInt();
        System.out.println("n : "+n);
        switch (n) {
        case 1:
            System.out.println("Nhap chieu dai");
            d = sc.nextFloat();
            System.out.println("Nhap chieu rong");
            r = sc.nextFloat();
            cv = d + r;
            dt = d * r;
            System.out.println("Chu vi :" + cv);
            System.out.println("Dien tich :" + dt);
        case 2:
            System.out.println("Nhap vao ban kinh duong tron");
            r = sc.nextFloat();
            dt = (float) Math.PI * r * r;
            cv = (float) Math.PI * r;
            System.out.println("Chu vi hinh tron :" + cv);
            System.out.println("Dien tich cua hinh tron:" + dt);
        default :
            System.out.println("Nhap sai ");
        }

    }
}
