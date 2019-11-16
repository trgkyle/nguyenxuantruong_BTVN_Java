package bai3;

public class Support {
    private String name = "Nguyen C T";
    private int age = 22;
    private String[] group = { "Truong", "Hai", "Long", "Quan" };

    public void display() {
        System.out.println("name: " + this.name + ", age: " + this.age + ", Name of each member in group : ");
        for (int i = 0; i < group.length; i++) {
            System.out.print(group[i] + ", ");
        }
    }
}