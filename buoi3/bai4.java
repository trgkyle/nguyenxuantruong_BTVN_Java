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
public class bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        String Template = "hello";
        input = sc.nextLine();
        for(int i = 0 ; i < (input.toCharArray()).length ; i ++){
            if(Template.length()>0){
                if((input.toCharArray()[i] == Template.toCharArray()[0])){
                    Template = Template.substring(1);
                }
            }
        }
        if(Template.length() == 0)
            System.out.println("Yes");
        else System.out.println("No");
        
    }
}
