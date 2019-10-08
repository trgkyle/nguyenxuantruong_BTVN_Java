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
public class bai6 {
    public static void main(String[] args){
        int n1,m1;
        float n2,m2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n1 :");
        n1 = sc.nextInt();
        
        System.out.println("Nhap vao so nguyen m1 :");
        
        m1 = sc.nextInt();
        
        int sum1 = n1+m1;
        System.out.println("Tong cua 2 so nguyen m,n : "+sum1);
        
        
        System.out.println("Nhap vao so thuc n2 :");
        n2 = sc.nextFloat();
        
        System.out.println("Nhap vao so thuc m2 :");
        
        m2 = sc.nextFloat();
        
        float sum2 = n2+m2;
        System.out.println("Tong cua 2 so thuc m,n : "+sum2);
    }
}
