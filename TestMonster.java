public class TestMonster {
    public static void main(String[] args){
        Monster m1 = new FireMonster("fire");
        Monster m2 = new WaterMonster("water");
        Monster m3 = new StoneMonster("stone");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("Stone");
        System.out.println(m1.attack());

        Monster m4 = new Monster("monster");
        System.out.println(m4.attack());
    }
}
