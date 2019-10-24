/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author truongcss
 */
import java.util.*;
public class Student {
    private String name;
    private String code;
    private int age;
    public void InputInfo(){
        Scanner sc =new Scanner(System.in);
        System.out.println("student's name :");
        this.name = sc.nextLine();
        System.out.println("student's code :");
        this.code = sc.nextLine();
        System.out.println("studuet's age :");
        this.age = sc.nextInt();
    }
    public void ShowInfo(){
        System.out.println("Ten: "+this.name + ", ma sc: "+this.code+ ", tuoi: "+this.age);
    }
}
