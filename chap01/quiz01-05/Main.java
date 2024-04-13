import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Monster("スライム", 10, false));
        monsters.add(new Monster("ドラゴン", 100, true));
        monsters.add(new Monster("ゴブリン", 50, false));

        for(Monster monster : monsters) {
            // In the case of records, getter is not prefixed with "get"
            System.out.println(monster.name() + " " + monster.hp() + " " + monster.isBoss());
        }
    }
}