/*package basic.code;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student [] arr = new Student[100];
        Student student1 = new Student(6,"Erica",16);
        Student student2 = new Student(3,"lisa",13);
        Student student3 = new Student(2,"Erica",14);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新学生的id：");
        int newId = sc.nextInt();
        Student newStudent = new Student();
        newStudent.setId(newId);
        System.out.println("请输入新学生的姓名");
        String newName = sc.next();
        newStudent.setName(newName);
        System.out.println("请输入新学生的年龄");
        int newAge = sc.nextInt();
        newStudent.setAge(newAge);
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;
        arr[3] = newStudent;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("id:"+arr[i].getId()+"name:"+arr[i].getName()+"age"+arr[i].getAge());
        }

    }
}*/
package basic.code;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[100];
        Student student1 = new Student(6, "Erica", 16);
        Student student2 = new Student(3, "lisa", 13);
        Student student3 = new Student(2, "Erica", 14);
        int count = 0;
        arr[count++] = student1;
        arr[count++] = student2;
        arr[count++] = student3;

        Scanner sc = new Scanner(System.in);
        boolean FoundId = true;
        int newId;
        do {
            System.out.println("请输入新学生的id：");
            newId = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (arr[i].getId() == newId) {
                    FoundId = false;
                    System.out.println("您输入的学生ID已存在，请重新输入");
                    break;
                }else if (arr[i].getId() != newId){
                    FoundId = true;
                }
            }
        }while (!FoundId);

        Student newStudent = new Student();
        newStudent.setId(newId);
        System.out.println("请输入新学生的姓名：");
        String newName = sc.next();
        newStudent.setName(newName);
        System.out.println("请输入新学生的年龄：");
        int newAge = sc.nextInt();
        newStudent.setAge(newAge);
        arr[count++] = newStudent;

        for (int i = 0; i < count; i++) {
            System.out.println("id: " + arr[i].getId() + ", name: " + arr[i].getName() + ", age: " + arr[i].getAge());
        }
    }
}
