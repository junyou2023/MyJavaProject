package basic.code;

import java.util.Scanner;

public class Md {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个长方形的长和宽： ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("请输入第二个长方形的长和宽： ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        method(a,b,c,d);
    }
    public static void method(int A, int B, int C, int D){
        int S1 = A * B;
        int S2 = C * D;

        if (S1 > S2) {
            System.out.println("第一个长方形比第二个长方形面积大");
        }else {
            System.out.println("第二个长方形比第一个长方形面积大");
        }
    }
}
