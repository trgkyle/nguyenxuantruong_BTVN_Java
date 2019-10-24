/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import containers.Person;
/**
 *
 * @author truongcss
 */
public class RunMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person SonNghien = new Person();
        Person TuBueDe = new Person();
        SonNghien.setName("Son");
        SonNghien.setAge(0b10101);
        SonNghien.setHobby("Go go");
        SonNghien.setSex("Undefined!!!");
        
        
        TuBueDe.setName("Tu");
        TuBueDe.setAge(0b10100);
        TuBueDe.setHobby("Sexy dancing");
        TuBueDe.setSex("female");
        
        
        System.out.println("Son nghien printing");
        System.out.println(SonNghien.getName());
        System.out.println(SonNghien.getAge());
        System.out.println(SonNghien.getHobby());
        System.out.println(SonNghien.getSex());
        
        
        System.out.println("Tu printing");
        System.out.println(TuBueDe.getName());
        System.out.println(TuBueDe.getAge());
        System.out.println(TuBueDe.getHobby());
        System.out.println(TuBueDe.getSex());
    }
    
}
