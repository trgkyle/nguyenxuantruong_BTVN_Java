package bai3;

public class Member {
    private String name = "Nguyen Van A";
    private int activeDay = 199;
    private int dayOffInClass = 3;

    public void display() {
        System.out.println("name :" + this.name + ", ngay hoat dong :" + this.activeDay + ", so ngay nghi trong lop :"
                + this.dayOffInClass);
    }
}