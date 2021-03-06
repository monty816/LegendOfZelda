/**
 * Created by Jimmy on 6/7/2014.
 */
public class TestEnemy extends Enemy {
    protected static final int OLDAGE = 160;
    protected static final int REPRODUCTIONAGE = 20;
    protected static final int normalSpeed = 1;
    private static String path = "Knight.gif";

    public TestEnemy(int x, int y)
    {
        super(path, x, y);
        name = "TestEnemy";
        velocity[X] = normalSpeed;
        velocity[Y] = normalSpeed;
    }
    public TestEnemy(int x, int y, int age)
    {
        super(path, x, y, age);
        name = "TestEnemy";
        velocity[X] = normalSpeed;
        velocity[Y] = normalSpeed;
    }
    public void act() {super.act();}
    public boolean tooOld()
    {
        if(age>OLDAGE)
            return true;
        else
            return false;
    }
}