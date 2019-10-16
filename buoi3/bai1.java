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
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int[] a;
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int firstmax=a[0],secondmax=a[0],thirdmax=a[0];
        //System.out.println(firstmax + " : " + secondmax + " : " + thirdmax);
        for(int i = 0 ; i < n ; i++){
            if(firstmax < a[i]){
                firstmax = a[i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            if((secondmax < a[i] && a[i] < firstmax) || secondmax == firstmax){
                secondmax = a[i];
            }
            
        }
        for(int i = 0 ; i < n ; i++){
            if((thirdmax < a[i] && a[i] < secondmax) || thirdmax >= secondmax){
                thirdmax = a[i];
            }
        }
        System.out.println("Firstmax :" + firstmax);
        System.out.println("Secondmax :" + secondmax);
        System.out.println("Thirdmax :" + thirdmax);

        
    }
}
