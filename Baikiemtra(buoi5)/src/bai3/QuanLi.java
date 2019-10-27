/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author truongcss
 */
import java.util.*;
public class QuanLi {
    private Mon b = new Mon();
    private SinhVien a[];
    private int n;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("n :");
        n = sc.nextInt();
        
        b.inputMon();
        a = new SinhVien[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = new SinhVien();
        }
        for(int i = 0 ; i < n ; i++){
            a[i].inputSV();
        }
        
    }
    public void output(){
        b.outputMon();
        for(int i = 0 ; i < n ; i++){
            a[i].outputSV();
            if(a[i].getSoTietNghi()>= (float)b.getSoTiet()*(1/3)){
                System.out.println("Sinh vien duoc di thi");
            }
            else{
                System.out.println("Sinh vien bi CAM THI");
            }
        }
    }
}
