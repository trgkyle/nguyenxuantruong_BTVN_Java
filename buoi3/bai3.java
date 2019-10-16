/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author truongcss
 */
import java.util.*;
import java.util.ArrayList;
public class bai3 {
    static void Nhap(ArrayList<Integer> a){
        System.out.println("Tao va nhap mang moi voi n so nguyen ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n:");
        int n = 0;
        n = sc.nextInt();
        for(int i  = 0 ; i < n ; i++){
            a.add(sc.nextInt());
        }
    }
    static void Hienthimang(ArrayList<Integer> a){
        System.out.println("Hien thi mang vua tao ");
        for(Integer arr : a){
            System.out.print(arr+ "  ");
        }
        System.out.println();
    }
    static void Xoamang(Scanner sc,ArrayList<Integer> a){
        System.out.println("Xoa mang");
        int n = 0;
        System.out.println("Nhap vi tri phan tu cua mang ");
        n = sc.nextInt();
        if(n > a.size() && n > 0){
            System.out.println("Vi tri xoa khong hop le size cua Array :"+a.size());
        }
        else{
            a.remove(n-1);
            System.out.println("Xoa thanh cong !!!");
        }
    }
    static void Reversearr(ArrayList<Integer> a){
        System.out.println("Dao nguoc mang");
        for(int i = 0 ; i < a.size()/2 ; i++){
            Collections.swap(a,i,a.size()-i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int switcher = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(true){
            System.out.println("===============================MENU============================");
            System.out.println("1. Nhap mang");
            System.out.println("2. Hien thi mang");
            System.out.println("3. Xoa phan tu mang");
            System.out.println("4. Dao vi tri cua mang");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("===============================================================");
            System.out.println("Nhap truy van :");
            switcher = sc.nextInt();
            switch(switcher){
                case 1:
                    Nhap(a);
                    break;
                case 2:
                    Hienthimang(a);
                    break;
                case 3:
                    Xoamang(sc,a);
                    break;
                case 4:
                    Reversearr(a);
                    break;
                case 5:
                    System.out.println("BYE!!!");
                    return;
                default:
                    System.out.println("Sai cu phap");
            }
        }
    }
}
