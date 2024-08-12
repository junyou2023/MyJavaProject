package basic.code;

import java.util.Scanner;

public class rank {
    public static void main(String[] args) {
        int []arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6个数字");
        // 将分数存入数组中
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        //求数组的最大值
        int max = getMax(arr);
        //求数组的最小值
        int min = getMin(arr);
        System.out.println("最大值是"+max);
        System.out.println("最小值是"+min);
    }
    private static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    }
