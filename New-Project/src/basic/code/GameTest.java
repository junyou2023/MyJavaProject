package basic.code;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
            Game role1 = new Game("乔峰",100);
            Game role2 = new Game("鸠摩智",100);
            Scanner sc1 = new Scanner(System.in);
/*            while (true) {
                if (role1.getBlood()>0){
                    role1.attack(role2);
                }
                if (role2.getBlood()>0) {
                    role2.attack(role1);
            }else {
                System.out.println("游戏结束");
                break;
            }
        }*/
            while (true){
                role1.attack(role2);
                if (role2.getBlood() == 0) {
                    System.out.println(role1.getName()+"KO了"+role2.getName()+", 游戏结束");
                    break;
                }
                role2.attack(role1);
                if (role1.getBlood()==0) {
                    System.out.println(role2.getName()+"KO了"+role1.getName()+", 游戏结束");
                    break;
                }

            }
    }
}
