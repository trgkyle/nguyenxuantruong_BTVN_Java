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
public class JavaClass {
    private Student stdList[];
    private int ratingStar;
    private Scanner sc = new Scanner(System.in);
    // i don't know my sp don't express decale leader's name of each class
    private String leaderName;
    private void InputSudent(){
        System.out.println("Numbers of student");
        int n = sc.nextInt();
        sc.nextLine();
        stdList = new Student[n];
        for(int i = 0 ; i < n ; i++){
            stdList[i] = new Student();
            stdList[i].InputInfo();
        }
    }
    private void ShowStudent(){
        for(int i = 0 ; i < stdList.length ; i++){
            stdList[i].ShowInfo();
        }
    }
    public void InputClassInfo(){
        System.out.println("Name Leader :");
        leaderName = sc.nextLine();
        System.out.println("ratingStart : ");
        ratingStar = sc.nextInt();
        sc.nextLine();
        this.InputSudent();
    }
    public void ShowClassInfo(){
        System.err.println("Name Leader :"+ leaderName + ", rating in :"+ ratingStar);
        this.ShowStudent();
        
    }
}
