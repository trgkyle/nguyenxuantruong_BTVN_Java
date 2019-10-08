/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

/**
 *
 * @author truongcss
 */
import java.util.*;
public class bai7 {
    public static void main(String[] args){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen :");
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println("Max : "+ (n>m?n:m));
        System.out.println("Min : "+ (n<m?n:m));
    }
}
