package basic.code;

public class GirlTest {
    public static void main(String[] args) {
        Girl [] arr = new Girl[3];
        arr[0] = new Girl("Alice", 25, "Reading");
        arr[1] = new Girl("Bob", 30, "Painting");
        arr[2] = new Girl("Carol", 20, "Singing");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();
        }
        System.out.println(sum);
        double average = sum/ arr.length;
        System.out.println("The average age is: " + average);

        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            Girl gf = arr[i];
            if (gf.getAge()<average) {
                count++;
                System.out.println(gf.getName()+","+gf.getAge()+","+gf.getHobby());
            }
        }
        System.out.println("年龄比平均值低的有"+count+"个");
    }
}

