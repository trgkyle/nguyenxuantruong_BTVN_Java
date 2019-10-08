/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

import java.util.Scanner;

/**
 *
 * @author truongcss
 */
public class bai9 {
    public static void main(String[] args){
        float a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tham so a :");
        a = sc.nextFloat();
        System.out.println("Nhap vao tham so b :");
        b = sc.nextFloat();
        x = -b/a;
        System.out.println("x :"+x);
    }
}
