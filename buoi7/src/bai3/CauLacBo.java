package bai3;

public class CauLacBo {
    private Leader A = new Leader();
    private Support B = new Support();
    private Member C = new Member();

    CauLacBo() {
        A = new Leader();
        B = new Support();
        C = new Member();
    }

    public void display() {
        A.display();
        B.display();
        C.display();
    }
}