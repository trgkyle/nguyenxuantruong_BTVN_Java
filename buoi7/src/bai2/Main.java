package bai2;

public class Main {
    public static void main(String[] args) {
        MayTinh maytinh = new MayTinh();
        float[] array = { (float) 2.4, (float) 2.6, (float) 7, (float) 8.9 };
        System.out.println(maytinh.TinhTong(array[0], array[1]));

        System.out.println(maytinh.TinhTong(array[0], array[1], array[2]));
        System.out.println(maytinh.TinhTong(array));
    }
}