package basic.code;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        double price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入经济舱或头等舱");
        String type = sc.next();
        extracted(month, type, price);

    }

    private static void extracted(int month, String type, double price) {
        if ((month <=10 || month >=5) && type.equals("头等舱")){
            price = price * 0.9;
        }else if ((month <5 || month >10) && type.equals("经济舱")){
            price = price * 6.5;

        }else if (((month <=10 || month >=5) && type.equals("经济舱"))) {
            price = price * 8.5;
        }else if ((month <5 || month >10) && type.equals("头等舱")){
            price = price * 7;}
        else {
            System.out.println("暂无此类型折扣");
        }
        System.out.println("最终价格："+ price);
    }
}
