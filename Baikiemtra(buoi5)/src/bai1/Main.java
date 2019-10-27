/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author truongcss
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
       // TODO code application logic here
       String a;
       a = sc.nextLine();
       int demsochan = 0,tong = 0;
       for(int i = 0 ; i < a.toCharArray().length; i++){
           if(a.toCharArray()[i] >= '0' && a.toCharArray()[i] <= '9'){
               int check = a.toCharArray()[i]-48;
               if(check %2 == 0){
                   tong +=check;
                   demsochan ++;
               }
           }
       }
        System.out.println("Sochan :"+demsochan + ", Tong : "+ tong);
    }
    
}
