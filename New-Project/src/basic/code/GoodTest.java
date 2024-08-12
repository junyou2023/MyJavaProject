package basic.code;

public class GoodTest {
    public static void main(String[] args) {
        Good g1 = new Good(1, "ipone", 9999.0, 6);
        Good g2 = new Good(2, "laptop", 9999.0, 9);
        Good g3 = new Good(3, "bag", 9999.0, 20);
        Good[] arr = new Good[3];

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Good good = arr[i];
            System.out.println(good.getCount() + ","+good.getName());
        }
    }
}
