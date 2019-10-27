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
public class Mon {
    private String MaMon;
    private String TenMon;
    private int SoTiet;

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }

    public String getMaMon() {
        return MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public int getSoTiet() {
        return SoTiet;
    }
    public void inputMon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma mon :");
        
        setMaMon(sc.nextLine());
        
        System.out.println("Ten mon :");
        
        setTenMon(sc.nextLine());
        System.out.println("So tiet :");
        
        setSoTiet(sc.nextInt());
        sc.nextLine();
    }
    public void outputMon(){
        System.out.println("Ma mon :" + getMaMon());
        System.out.println("Ten mon :" + getTenMon());
        System.out.println("So tiet : "+ getSoTiet());
    }
}
