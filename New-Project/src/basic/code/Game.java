package basic.code;

import java.util.Random;

public class Game {
    private String name;
    private int blood;

    public Game() {
    }

    public Game(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Game role){
        Random r = new Random();
        int damage = r.nextInt(30);
        role.blood = role.blood - damage;
        role.blood = (role.blood < 0) ? 0 : role.blood;
        System.out.println(this.getName()+"对"+role.getName()+"造成了"+damage+"点伤害, "+
                role.getName()+"还剩下"+role.blood+"点血量");


    }
}
