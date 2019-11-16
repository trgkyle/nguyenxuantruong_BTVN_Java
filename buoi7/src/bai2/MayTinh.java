package bai2;

public class MayTinh {
    public float TinhTong(float prm1, float prm2) {
        return prm1 + prm2;
    }

    public float TinhTong(float prm1, float prm2, float prm3) {
        return prm1 + prm2 + prm3;
    }

    public float TinhTong(float[] prm1) {
        float sum = 0;
        for (int i = 0; i < prm1.length; i++) {
            sum += prm1[i];
        }
        return sum;
    }
}