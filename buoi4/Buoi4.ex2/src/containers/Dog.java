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
public class Dog {
    private String name;
    private int MP=100;
    public void InputName(String name){
        this.name = name;
    }
    public void ShowMP(){
        System.out.println("MP :" + this.MP);
    }
    public void Bark(){
        if(this.name == null)
            System.out.println("Xin loi ban chua dien ten");
        else{
            System.out.println(name /* where is avaiable sua */+ " Hihi");
            this.MP-=20;
        }
    }
}
