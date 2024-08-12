package basic.code;

public class Helloworld {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int result = sc.nextInt();
//        if (result >= 0 && result <= 100) {
//            if (result >= 95) {
//                System.out.println("送自行车");
//            } else if (result >= 94) {
//                System.out.println("游乐场玩一天");
//            } else if (result >= 80) {
//                System.out.println("送模型");
//            } else System.out.println("痛揍一顿");
//        }
//        else System.out.println("成绩不合规则");


//        Scanner sc = new Scanner(System.in);
//        int result = sc.nextInt();
//        switch (result){
//            case 1-> System.out.println("打篮球");
//            case 2-> System.out.println("游泳");
//            case 3-> System.out.println("踢足球");
//            case 4 -> System.out.println("跑步");
//            default-> System.out.println("跆拳道");
//        }
//        int sum = 0;
//        for (int i=1; i<101 ; i++){
//            if (i%2==0) {
//                System.out.println(i);
//                ;     sum += i;
//            }
//
//        }
//        System.out.println(sum);
//        double paper = 0.1;
//        int count = 0;
//        while (paper < 8844430) {
//            System.out.println(paper);
//            paper = paper*2;
//            count ++;
//        }
//        System.out.println(count);
//        for (int i=1; i<101; i++) {
//            if (i%7==0) {
//                System.out.println("过");
//                continue;
//            }
//            System.out.println(i);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] % 2 == 0) {
                arr[i1] = arr[i1]/2;
            }else {
                arr[i1] = arr[i1]*2;
            }
            System.out.println(arr[i1]);
        }
    }
}

