package school;

public class Desk extends Furniture{

    // https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
    private static int serialNumber = 1000;

    public Desk( School school)
    {
        super(school, 50);
        serialNumber++;

    }

    public Desk brokenDesk(){
        return null;
    }
}
