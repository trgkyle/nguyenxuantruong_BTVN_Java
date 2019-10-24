/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author truongcss
 */
import containers.Dog;
import java.util.Scanner;
public class RunMain {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dog b612 = new Dog();
        b612.ShowMP();
        b612.Bark();
        b612.ShowMP();
        b612.InputName(sc.nextLine());
        b612.Bark();
        b612.ShowMP();
        b612.Bark();
        b612.ShowMP();
        b612.Bark();
        b612.ShowMP();
    }
}
