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
public class bai8 {
    public static void main(String[] args){
        int n,m,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 3 so nguyen :");
        n = sc.nextInt();
        m = sc.nextInt();
        p = sc.nextInt();
        int max = (n>m?n:m)>p?(n>m?n:m):p;
        int min = (n<m?n:m)>p?p:(n<m?n:m);
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }
}
