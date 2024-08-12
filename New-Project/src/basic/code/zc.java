package basic.code;

public class zc {
    public static void main(String[] args) {
        int arr[] = {43, 41, 452, 653, 6353, 524, 413, 653, 63};
        copyOfRange(arr, 3, 8);




    }

    public static int[] copyOfRange(int[] arr,int from, int to) {
        int[] newArr = new int[89];
        int j=0;
        for (int i = from; i < to; i++) {
            newArr[j]=arr[i];
            j++;
        }
        for (int i = 0; i < to-from; i++) {
            System.out.println(newArr[i]);
        }
        return newArr;
    }
}