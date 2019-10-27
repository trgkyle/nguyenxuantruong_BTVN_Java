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
public class SinhVien {
    private String TenSV;
    private String MaSV;
    private String SDT;
    private int SoTietNghi;

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setSoTietNghi(int SoTietNghi) {
        this.SoTietNghi = SoTietNghi;
    }

    public String getTenSV() {
        return TenSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getSDT() {
        return SDT;
    }

    public int getSoTietNghi() {
        return SoTietNghi;
    }
    public void inputSV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten SV :");
        
        setTenSV(sc.nextLine());
        System.out.println("Ma SV :");
        
        setMaSV(sc.nextLine());
        System.out.println("SDT of SV :");
        
        setSDT(sc.nextLine());
        System.out.println("So tiet nghi :");
        
        setSoTietNghi(SoTietNghi);
        
        setSoTietNghi(sc.nextInt());
        
        sc.nextLine();
    }
    public void outputSV(){
        System.out.println("Ten SV : "+ getTenSV());
        System.out.println("Ma SV : "+ getMaSV());
        System.out.println("SDT SV : "+ getSDT());
        System.out.println("So tiet nghi : "+ getSoTietNghi());
    }
    
}
