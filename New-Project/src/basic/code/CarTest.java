package basic.code;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car [] arr = new Car[3];
        for (int i = 0; i < arr.length; i++) {
            Scanner SC = new Scanner(System.in);
            Car car = new Car();
            System.out.println("请输入汽车品牌");
            car.setBrand(SC.next());
            System.out.println("请输入汽车颜色");
            car.setColour(SC.next());
            System.out.println("请输入汽车价格");
            car.setPrice(SC.nextInt());
            arr[i] = car;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("汽车品牌：" + arr[i].getBrand());
            System.out.println("汽车颜色：" + arr[i].getColour());
            System.out.println("汽车价格：" + arr[i].getPrice());
        }

        double avr = 0;
        for (int i = 0; i < arr.length; i++) {
            avr = avr + arr[i].getPrice();
        }
        avr = avr / arr.length;
        System.out.println("平均价格：" + avr);

    }
}
