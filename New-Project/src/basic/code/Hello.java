package basic.code;

public class Hello {
    public static void main(String[] args) {
//        int []arr = new int[10];
//        Random random = new Random();
//        int sum = 0;
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int num = random.nextInt(100)+1;
//            sum = sum + num;
//            int average = sum/arr.length;
//            arr[i] = num;
//            if (arr[i]< average) {
//                count++;
//            }
//        }
//        System.out.println("求所有数的和:"+sum);
//        System.out.println("统计比平均值小的数:"+count);
        int arr[] = {1,2,3,4,5};
        int temp = arr[0];
        arr[0]= arr[arr.length-1];
        arr[arr.length-1] = temp;
        System.out.println("第一："+ arr[0]+ "第二:" + arr[4]);



    }

}
