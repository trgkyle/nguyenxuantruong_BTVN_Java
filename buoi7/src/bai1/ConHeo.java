package bai1;

import java.util.*;

public class ConHeo {
    private String name;
    private float weight;
    private int age;
    ConHeo(){
        name = "Nguyen Xuan Truong";
        weight = (float)52.3;
        age = 19;
    }
    public void HienThi(){
        System.out.println("name :"+ this.name);
        System.out.println("weight :"+ this.weight);
        System.out.println("age :"+ this.age);
    }
}